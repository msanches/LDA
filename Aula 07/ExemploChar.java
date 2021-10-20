import javax.swing.JOptionPane;

public class ExemploChar {
    public static void main(String[] args) {
        double salario, bonus;
        int perc;
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário bruto R$"));
        
        perc = (salario > 1000) ? 10 : 15;

        bonus = salario * perc/100;
        
        JOptionPane.showMessageDialog(null, String.format("Você receberá %d %% de bônus \nR$ %.2f", perc, bonus));
    }
}
