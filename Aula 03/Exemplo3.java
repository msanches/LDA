import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                            "Digite a hora atual"));
        int min = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                "Digite os minutos"));
        min = horas * 60 + min;
        JOptionPane.showMessageDialog(null, 
                String.format("Já se passaram %d minutos desde o início do dia", min));
    }
}
