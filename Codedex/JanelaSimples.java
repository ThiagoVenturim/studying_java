import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Olá com Java GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(50, 30, 150, 30);
        frame.add(label);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(180, 30, 150, 30);
        frame.add(campoTexto);

        JButton botao = new JButton("Dizer Olá");
        botao.setBounds(130, 80, 120, 40);
        frame.add(botao);

        JLabel resultado = new JLabel("");
        resultado.setBounds(50, 130, 300, 30);
        frame.add(resultado);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoTexto.getText();
                resultado.setText("Olá, " + nome + "! Bem-vindo(a) ao Java GUI ☕");
            }
        });

        frame.setVisible(true);
    }
}
