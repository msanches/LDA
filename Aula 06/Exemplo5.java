import javax.swing.JOptionPane;
public class Exemplo5 {
    public static void main(String[] args) {
        int num;
        float raiz;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
        if(num >= 0){
            raiz = (float) Math.sqrt(num);
            JOptionPane.showMessageDialog(null, String.format("A raiz de %d é %.2f", num, raiz));
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz de número negativo");
        }            
    }
}
