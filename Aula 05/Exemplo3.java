import javax.swing.JOptionPane;
public class Exemplo3 {
    public static void main(String[] args) {
        int a,b,resmin;
        String entrada;
        entrada = JOptionPane.showInputDialog("Digite a quantidade de horas");
        a = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite a quantidade de minutos");
        b = Integer.parseInt(entrada);
        resmin = minutos(a,b);
        JOptionPane.showMessageDialog(null,"A quantidade de minutos que passaram é "+resmin);
    }
    public static int minutos(int horas,int minutos){
        int res;
        res = horas * 60  + minutos;
        return res;
    }    
}