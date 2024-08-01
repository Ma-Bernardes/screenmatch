package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExcption extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
