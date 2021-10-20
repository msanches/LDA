import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args){
        float v1,v2,result;
        int op;
        v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro valor"));
        v2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo valor"));
        op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a operação desejada\n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão"));
        switch(op){
            case 1:
                result = v1 + v2;
                JOptionPane.showMessageDialog(null,"O resultado é "+result);
                break;
            case 2:
                result = v1 - v2;
                JOptionPane.showMessageDialog(null,"O resultado é "+result);
                break;
            case 3:
                result = v1 * v2;
                JOptionPane.showMessageDialog(null,"O resultado é "+result);
                break;
            case 4:
                if(v2 != 0){
                    result = v1 / v2;
                    JOptionPane.showMessageDialog(null,"O resultado é "+result);
                } else {
                    JOptionPane.showMessageDialog(null,"Não há divisão por zero");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"A numero da operação digitada é inválido");
        }
    }
}
