import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        float angulo = Float.parseFloat(
            JOptionPane.showInputDialog(null, "Digite um ângulo em graus"));
        angulo = (float) Math.toRadians(angulo);
        float seno = (float) Math.sin(angulo);
        float cosseno = (float) Math.cos(angulo);
        float tangente = (float) Math.tan(angulo);
        JOptionPane.showMessageDialog(null, String.format(
                    "seno = %.2f\ncosseno = %.2f\ntangente = %.2f", seno, cosseno, tangente));
    }
}
