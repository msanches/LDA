import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua idade?"));
        String d = a >= 18 ? "maior de idade": "menor de idade";
        System.out.println("Você é " + d);
    }
}