import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, 
                                            "Digite o salário do funcionário"));
        double imposto = salario * 10/100;
        System.out.println(imposto);
        salario = salario + 50 - imposto;
        JOptionPane.showMessageDialog(null, 
                                String.format("Salário a receber = %.2f", salario));
    }
}
