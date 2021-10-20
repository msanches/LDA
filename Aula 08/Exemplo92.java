import javax.swing.JOptionPane;
import java.util.Random;
 
public class Exemplo92{
    public static void main(String[] args){
        int num, random, i;
        Random r = new Random();
        random = r.nextInt(100);
        num = 0;
        i = 0;
        do{
            i += 1;
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro: "));
            if(num == random){
                JOptionPane.showMessageDialog(null, "Você acertou o número " + random + " em " + i + " tentativas");
            }
            else if(num < random){
                JOptionPane.showMessageDialog(null, "O número sorteado é maior!");
            }
            else if(num > random){
                JOptionPane.showMessageDialog(null, "O número sortedo é menor!!!");
            }
        }
        while(num != random);

    }
}