import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        float nota1, nota2, media;
        String temp;
        temp = JOptionPane.showInputDialog(null, "Digite a nota 1");
        nota1 = Float.parseFloat(temp);
        temp = JOptionPane.showInputDialog(null, "Digite a nota 2");
        nota2 = Float.parseFloat(temp);
        media = (nota1+nota2)/2;
        if(media >= 6.0)
            JOptionPane.showMessageDialog(null, "APROVADO");
        else
        JOptionPane.showMessageDialog(null, "REAPROVADO");
    }
}
