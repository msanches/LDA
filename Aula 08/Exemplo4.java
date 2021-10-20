import javax.swing.JOptionPane;
public class Exemplo4{
    public static void main(String[] args) {
        int num, i, fatorial;
        fatorial = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para calcular o fatorial:"));    
        for(i=1; i<=num; i++){
            fatorial = fatorial * i;   
        }
        if(num >=0)
            JOptionPane.showMessageDialog(null, "Fatorial = " + fatorial);
        else
            JOptionPane.showMessageDialog(null, "Não há fatorial de número negativo!");
        
        JOptionPane.showConfirmDialog(null, "Quer continuar?");
    }
}