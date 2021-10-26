import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        float[][] nota = new float[10][3];
        float[] media = new float[10];
        int i, j, qte=0;
        for(i=0; i<2; i++){
            float soma = 0;
            for(j=0; j<3; j++){
                nota[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a "+(j+1)+"ª nota do "+(i+1)+"º aluno"));
                soma += nota[i][j];
            }
            media[i] = soma/3;
            if(media[i]>6)
                qte++;
        }
        System.out.println("Nº\tNota1\tNota2\tNota3\tMedia");
        for(i=0; i<2; i++){
            System.out.print((i+1)+"\t");
            for(j=0; j<3; j++){
                System.out.print(nota[i][j]+"\t");
            }
            System.out.print(media[i]+"\n");
        }
        System.out.print("A quantidade de alunos aprovados é: " + qte);
    }
}
