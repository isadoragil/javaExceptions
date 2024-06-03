package exercicio3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pesquise um usuário no github:");
        String usuario = sc.nextLine();

        try {
                String endereco = "https://api.github.com/users/" + usuario;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .header("Accept", "application/vnd.github+json")
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 404) {
                    throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
                }

                String json = response.body();
                System.out.println(json);
            } catch (IOException | InterruptedException e) {
                System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
                e.printStackTrace();
            } catch (ErroConsultaGitHubException e) {
                System.out.println(e.getMessage());
            }
    }
}
