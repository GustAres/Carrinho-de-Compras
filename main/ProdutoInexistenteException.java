public class ProdutoInexistenteException extends RuntimeException {
    public ProdutoInexistenteException(String mensagem) {
        super(mensagem);
    }
}