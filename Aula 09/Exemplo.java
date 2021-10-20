import javax.swing.JOptionPane;

public class Exemplo{
    public static void main(String[] args) {
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número"));
            int soma = n1 / n2;
            System.out.println("A soma é: " + soma);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        } catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não há divisão por zero");
        }
    }
}