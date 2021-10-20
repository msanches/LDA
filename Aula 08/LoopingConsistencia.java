import javax.swing.JOptionPane;

public class LoopingConsistencia {
    public static void main(String[] args) {
        float nota;

        do{
            nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno"));
            if(nota<0 || nota>10)
                JOptionPane.showMessageDialog(null, "A nota digitada é inválida!!!");
        } while(nota<0 || nota > 10);

    }
}
