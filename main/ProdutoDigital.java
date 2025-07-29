public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
}