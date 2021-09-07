import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro R$:");
        valor = sc.nextInt();
        int cem = valor/100;
        int cinq = (valor % 100)/50;
        int vinte = (valor % 50)/20;
        int dez = (valor % 50 % 20)/10;
        int cinco = (valor % 10)/5;
        int dois = (valor % 5)/2;
        int um = (valor % 5 % 2);
        System.out.printf("%d notas de R$ 100 \n%d notas de R$ 50 \n", cem, cinq);
        System.out.printf("%d notas de R$ 20 \n%d notas de R$ 10 \n", vinte, dez);
        System.out.printf("%d notas de R$ 5 \n%d notas de R$ 2 \n", cinco, dois);
        System.out.printf("%d notas de R$ 1 \n", um);
        sc.close();
    }
}
