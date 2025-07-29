public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getTipo() {
        return "Físico";
    }
}