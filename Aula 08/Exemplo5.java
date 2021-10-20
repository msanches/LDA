import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        int i = 1;//inicializa

        while(i<=10){//condiciona
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1 do " + i + "º aluno"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2 do " + i + "º aluno"));
            media = (nota1+nota2)/2;
            JOptionPane.showMessageDialog(null, "A média do "+ i+"º aluno é: " + media);
            i++; // atualiza
        }        
    }
}
