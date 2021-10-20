import javax.swing.JOptionPane;

public class Exemplo7 {
    public static void main(String[] args) {
        int num, soma;
        soma = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: (ou 0 para sair)"));
            if(num%2 != 0)
                soma = soma + num;
        } while(num !=0);
        JOptionPane.showMessageDialog(null, "A soma dos ímpares é: " + soma);        
    }
}