package exercicio1;

public class ErroDivisorException extends RuntimeException {
    private String mensagem;

    public ErroDivisorException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
