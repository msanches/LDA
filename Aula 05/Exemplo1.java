import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número"));
        String msg = JOptionPane.showInputDialog(null, "Digite uma mensagem");
        exibir(num, msg);
    }
    public static void exibir(float n, String m){
        System.out.println("Numero = " + n + "\nMensagem = " + m);
    }
}