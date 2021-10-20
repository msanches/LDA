import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        float media, freq;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média do aluno: ");
        media = sc.nextFloat();
        System.out.println("Digite a frequência do aluno: ");
        freq = sc.nextFloat();
        sc.close();
        if(freq < 75)
            System.out.println("Reprovado por falta");
        else 
            if(media >= 6)
                System.out.println("Aprovado");
            else 
                if (media >=4)
                    System.out.println("Avaliação Final!!");
                else 
                    System.out.println("Reprovado");
    }
}
