import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        double num, soma;
        int i;
        soma = 0;
        for(i=1; i<=10; i++){
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
            soma = soma + num;
        }
        System.out.println("A soma é: " + soma);
    }
}

/*5 - 10 - 20 - 30 */