import javax.swing.JOptionPane;

public class Exemplo6 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número")); 
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número"));

        if(a > b && b < c){
            JOptionPane.showMessageDialog(null, "O valor armazenado em b é menor");
        } else {
            JOptionPane.showMessageDialog(null, "O valor armazenado em b não é menor");
        }            
    }
}
