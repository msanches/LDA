import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do aluno (inteira 0-10)"));
        switch(nota){
            case 0:
            case 1:
                JOptionPane.showMessageDialog(null, "Conceito E");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Conceito D");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Conceito C");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            default:
                JOptionPane.showMessageDialog(null, "A nota digitada é inválida!");
        }
        
    }
}
