import javax.swing.JOptionPane;

public class Exemplo22 {
    public static void main(String[] args) {
        float peso, altura, imc;
        String categoria;
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite ao seu peso em Kg"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua altura em metros"));
        imc = peso/(altura*altura);
        if (imc < 20)
            categoria = "Abaixo do peso";
        else if (imc < 25)
            categoria = "Peso normal";
        else if (imc < 30)
            categoria = "Sobrepeso";
        else if (imc < 40)
            categoria = "Obeso";
        else
            categoria = "Obeso mórbido";
        
        JOptionPane.showMessageDialog(null, String.format("Seu IMC é %.2f Você esta na categoria: %s", imc, categoria));
    }
}
