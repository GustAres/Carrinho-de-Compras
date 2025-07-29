import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceCarrinho {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Carrinho de Compras");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel produtoLabel = new JLabel("Produto:");
        produtoLabel.setBounds(10, 20, 80, 25);
        panel.add(produtoLabel);

        JTextField produtoText = new JTextField(20);
        produtoText.setBounds(100, 20, 165, 25);
        panel.add(produtoText);

        JLabel precoLabel = new JLabel("Preço:");
        precoLabel.setBounds(10, 50, 80, 25);
        panel.add(precoLabel);

        JTextField precoText = new JTextField(20);
        precoText.setBounds(100, 50, 165, 25);
        panel.add(precoText);

        JButton addButton = new JButton("Adicionar");
        addButton.setBounds(10, 90, 120, 25);
        panel.add(addButton);

        JButton finalizarButton = new JButton("Finalizar Compra");
        finalizarButton.setBounds(140, 90, 180, 25);
        panel.add(finalizarButton);

        JTextArea log = new JTextArea();
        JScrollPane scroll = new JScrollPane(log);
        scroll.setBounds(10, 130, 360, 100);
        panel.add(scroll);

        Carrinho carrinho = new Carrinho();

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = produtoText.getText();
                double preco;
                try {
                    preco = Double.parseDouble(precoText.getText());
                } catch (NumberFormatException ex) {
                    log.append("Preço inválido.\\n");
                    return;
                }

                Produto produto = new ProdutoFisico(nome, preco);
                carrinho.adicionarProduto(produto);
                log.append("Adicionado: " + nome + " - R$" + preco + "\\n");
            }
        });

        finalizarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    carrinho.finalizarCompra(100.0);
                    log.append("Compra finalizada com sucesso!\\n");
                } catch (SaldoInsuficienteException ex) {
                    log.append("Erro: " + ex.getMessage() + "\\n");
                }
            }
        });
    }
}
