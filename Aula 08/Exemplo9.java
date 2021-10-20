import java.util.Random;

import javax.swing.JOptionPane;
public class Exemplo9 {
    public static void main(String[] args) {
        Random r = new Random();
        int sorteio, chute;
        sorteio = r.nextInt(30);
        System.out.println(sorteio);

        chute = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu palpite"));
        if(sorteio > chute)
            JOptionPane.showMessageDialog(null, "O número sorteado é maior");
        else if(sorteio < chute)
            JOptionPane.showMessageDialog(null, "O número sorteado é menor");
        else
            JOptionPane.showMessageDialog(null, "Parabéns você acertou!!");
    }
}
