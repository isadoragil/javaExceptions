package exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = sc.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida, acesso permitido!");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMensagem());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres, verifique!");
        }
    }
}



