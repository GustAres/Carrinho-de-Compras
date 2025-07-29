public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Produto livro = new ProdutoFisico("Livro", 50);
        Produto jogo = new ProdutoDigital("Jogo Online", 100);

        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(jogo);

        double total = carrinho.calcularTotal();
        double comDesconto = carrinho.aplicarDesconto(total);

        System.out.println("Total com desconto: R$" + comDesconto);

        try {
            carrinho.finalizarCompra(170.0); // saldo menor que total
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}