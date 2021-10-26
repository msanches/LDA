import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String[] args) {
        String[] nome = new String[1000];
        float[] nota = new float[1000];
        float media, soma=0;
        int i;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos "));
        
        for(i=0; i<n; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome[i]));
            soma = soma + nota[i];
        }

        media = soma/n;
        System.out.println("Média da turma = " + media);
        for(i=0; i<n; i++){
            if(nota[i]>=media)
                System.out.println("Parabéns " + nome[i]);
        }
    }
}