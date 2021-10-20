import javax.swing.JOptionPane;
 
public class Exemplo2B {
    public static void main(String[] args){
        float peso, altura, imc;

        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o seu peso, em kg: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a sua altura, em m: "));
        imc = peso/(float)(Math.pow(altura, 2));

        if(imc < 20.0){
            JOptionPane.showMessageDialog(null,String.format("Seu IMC foi de %.2fkg/m². Logo, você está Abaixo do Peso", imc));
        }
        else if(imc <= 24.9){
            JOptionPane.showMessageDialog(null,String.format("Seu IMC foi de %.2fkg/m². Logo, você está com Peso Normal", imc));
        }
        else if(imc <= 29.9){
            JOptionPane.showMessageDialog(null,String.format("Seu IMC foi de %.2fkg/m². Logo, você está com Sobrepeso", imc));
        }
        else if(imc <= 39.9){
            JOptionPane.showMessageDialog(null,String.format("Seu IMC foi de %.2fkg/m². Logo, você está Obeso", imc));
        }
        else if(imc >= 40.0){
            JOptionPane.showMessageDialog(null,String.format("Seu IMC foi de %.2fkg/m². Logo, você está com Obesidade Mórbida", imc));
        }
        else{
            JOptionPane.showMessageDialog(null, "Informações inválidas");
        }
    }
}
