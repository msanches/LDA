import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade jovem?"));
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Parabéns, você pode ter CNH");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena, você NÃO pode ter CNH");
        }
    }
}