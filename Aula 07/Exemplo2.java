import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        double peso, altura, imc;
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso em KG"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura em Metros"));
        imc = peso/ (altura*altura);
        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f ", imc));
        if(imc < 20)
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        else if(imc < 25)
            JOptionPane.showMessageDialog(null, "Peso normal");
        else if(imc < 30)
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        else if(imc < 40)
            JOptionPane.showMessageDialog(null, "Obeso");
        else
            JOptionPane.showMessageDialog(null, "Peso Mórbido");    
    }
}

