import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        int qtdehoras;
        char turno;

        qtdehoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas: "));
        turno = JOptionPane.showInputDialog(null, "Informe o turno de trabalho:\n[N]oturno\n[D]iurno").charAt(0);
        
        if (turno == 'n' || turno == 'N') 
            JOptionPane.showMessageDialog(null, "O valor do salário é " + qtdehoras * 45.00);
        else 
            if(turno == 'd' || turno == 'D')
                JOptionPane.showMessageDialog(null, "O valor do salário é " + qtdehoras * 37.50);
            else
                JOptionPane.showMessageDialog(null, "Opção inválida");        
    }
}
