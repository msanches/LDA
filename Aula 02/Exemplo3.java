import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        float peso, altura, imc;
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu peso em kg: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua altura em m: "));
        //Calcula o imc
        imc = peso / (altura*altura);

        JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc + "kg/m²");
        JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f kg/m²", imc));
        System.out.printf("O seu IMC é: %.2f", imc);
    }
}