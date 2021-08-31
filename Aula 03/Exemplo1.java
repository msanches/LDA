import javax.swing.JOptionPane;
public class Exemplo1 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
        media = (nota1*1 + nota2*2 + nota3*4 )/7;
        System.out.printf("Sua média é %.2f ", media);
        JOptionPane.showMessageDialog(null, String.format("Sua média é %.2f", media), "Média", 2);
    }
}