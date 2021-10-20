import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String[] args) {
        float nota, media, soma = 0;
        int contador = 0;
        char resp = 'S'; //inicialização da variável de controle

        while(resp == 's'){
            //Looping de consistência
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno"));
                if(nota<0 || nota>10)
                    JOptionPane.showMessageDialog(null, "A nota digitada é inválida!!");
            } while(nota<0 || nota>10);
            soma += nota;
            contador++;

            resp = JOptionPane.showInputDialog(null, "Deseja continuar? S/N").toLowerCase().charAt(0);
        }
        
        media = soma/contador;
        JOptionPane.showMessageDialog(null, "A média da turma é: " + media);
    }
}