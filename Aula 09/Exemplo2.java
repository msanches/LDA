import javax.swing.JOptionPane;
public class Exemplo2{
    public static void main(String[] args) {
        String login2;
        int senha2;
        String login = "matheus";
        int senha = 1234;
        login2 = JOptionPane.showInputDialog(null, "Login: ");
        senha2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Senha: "));
        if (login2.equals(login) && (senha2 == senha))
            JOptionPane.showMessageDialog(null, "Acesso liberado");
        else
            JOptionPane.showMessageDialog(null, "Acesso negado");
    }
}