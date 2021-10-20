import javax.swing.JOptionPane;

public class Aula06Ex03b {
    public static void main(String[] args) {
        float horas;
        int turno;
        turno = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu turno\n1- Diurno\n2-Noturno"));
        horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantas horas trabalhadas?"));
        
        calculaSalario(turno, horas);
    }
    public static void calculaSalario(int turno, float horas) {
        float salario = 0;
        switch(turno){
            case 1:
                salario = horas * 37.5f;
                break;
            case 2:
                salario = horas * 45f;
                break;
        }
        JOptionPane.showMessageDialog(null,
                    String.format("salario = %.2f", salario), " R$ seu salário do turno noite", 1);
    }
}
// Autor: Rafael Henrique da Silva
// RGM : 25390104
// Data : 26/09/2021