import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade jovem?"));
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Parabéns, você pode ter CNH");
        }
    }
}
