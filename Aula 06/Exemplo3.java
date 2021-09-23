import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exemplo3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        num = sc.nextInt();
        if(num%2 ==0){
            JOptionPane.showMessageDialog(null, "O número digitado é par!");
        } else{
            JOptionPane.showMessageDialog(null, "O número digitado é ímpar!");
        }
        sc.close();
    }
}
