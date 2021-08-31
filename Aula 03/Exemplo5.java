import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        double x, angulo, altura;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o comprimento da sombra (em m)?"));
        angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o ângulo de inclinação dos raios solares (em graus)?"));
        angulo = Math.toRadians(angulo);
        altura = x * Math.tan(angulo);
        JOptionPane.showMessageDialog(null, String.format("A altura do prédio é de %.2f metros", altura));
    }
}
