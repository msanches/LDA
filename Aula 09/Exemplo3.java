import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        String email; //email: teste@uol.com.br
        email = JOptionPane.showInputDialog(null, "Digite o seu e-mail: ");
        int index = email.indexOf('@')+1;
        System.out.println(index);
        JOptionPane.showMessageDialog(null, "Domínio: https://" + email.substring(index));
    }
}
