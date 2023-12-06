package br.com.alura.screenmatch.excecao;

    // classe personalizada para tratar uma exception
    // classe criada conforme a necessidade do dev
    // não vai extender da Throwable porque dessa forma é obrigatório o uso do try-catch
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
