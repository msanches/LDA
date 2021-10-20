import javax.swing.JOptionPane;

public class Exemplo6 {
    public static void main(String[] args) {
        double nota, media, soma = 0;
        char resp = 's';//inicializa
        int alunos = 0;

        while(resp == 's' || resp == 'S'){//condiciona
            do{
                nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a média do aluno:"));
                if(nota <0 || nota>10)
                    JOptionPane.showMessageDialog(null, "A nota digitada é inválida!");
            } while(nota<0 || nota >10);
            
            soma = soma + nota;
            alunos++;
            //atualiza
            resp = JOptionPane.showInputDialog(null, "Digite s para continuar:").charAt(0);
        } 
        media = soma/alunos;
        JOptionPane.showMessageDialog(null, "A média da disciplina é: " + media);
    }
}