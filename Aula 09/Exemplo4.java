import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        int num1, num2;
        float result;
        try {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
            
            result = (float) num1/num2;
            System.out.println("Divisão = " + result);
        } catch(NumberFormatException e2){
            System.out.println("Valor digitado incorreto!! ");
        } catch(ArithmeticException e){
            System.out.println("Não é possível dividir por zero ");
        }
    }
}
