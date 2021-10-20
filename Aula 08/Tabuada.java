import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        int num, i;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));

        for(i=0; i<=10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}