import javax.swing.JOptionPane;
/**
 * @author marco
 */
public class Exemplo5 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));
        n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o quarto número: "));
        media = (n1 + n2 + n3 + n4)/4;
        JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
    }
}
