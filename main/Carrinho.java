import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Descontavel {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;
    }

    public void finalizarCompra(double saldo) throws SaldoInsuficienteException {
        double total = calcularTotal();
        if (saldo < total) {
            throw new SaldoInsuficienteException("Saldo insuficiente para concluir a compra.");
        }
        System.out.println("Compra finalizada com sucesso!");
    }
}