import javax.swing.JOptionPane;

public class Exemplo1{
    public static void main(String[] args) {
        int num, i;
        String  temp = "";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        for(i=0; i<=10; i++){
            temp += num + " x " + i + "=" + num*i +"\n";
           // JOptionPane.showMessageDialog(null, "Olá mundo");
        }
            JOptionPane.showMessageDialog(null,"Tabuada: \n " + temp ); 
    }
}
/*
soma += num
soma = soma + num */