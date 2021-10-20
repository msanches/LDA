import javax.swing.JOptionPane;

public class ExemploTernario {
    public static void main(String[] args) {
        double salario, bonus;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário"));
        
        bonus = (salario > 1000) ? salario*0.1 : salario*0.15;

        JOptionPane.showMessageDialog(null, "O bônus será de R$ " + bonus);
    }
}