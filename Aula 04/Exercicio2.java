import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro número");
        a = sc.nextInt();
        System.out.println("Segundo número");
        b = sc.nextInt();
        System.out.println("Terceiro número");
        c = sc.nextInt();
        System.out.println("Quarto número");
        d = sc.nextInt();
        diferenca = (a*b - c*d);
        System.out.println("diferença = " + diferenca);
        sc.close();
    }
}
