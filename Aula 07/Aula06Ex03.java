import javax.swing.JOptionPane;

public class Aula06Ex03 {
    public static void main(String[] args) {
        float horas;
        int turno;
        turno = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu turno\n1- Diurno\n2-Noturno"));
        horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantas horas trabalhadas?"));
        
        calculaSalario(turno, horas);
    }
    public static void calculaSalario(int turno, float horas) {
        float salario;
        salario = horas * ((turno == 2) ? 45f : 37.5f);
        JOptionPane.showMessageDialog(null,
                    String.format("salario = %.2f", salario), " R$ seu salário do turno noite", 1);
    }
}
// Autor: Rafael Henrique da Silva
// RGM : 25390104
// Data : 26/09/2021