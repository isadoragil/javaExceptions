package exercicio3;

public class ErroConsultaGitHubException extends RuntimeException {
    private String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
