import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2, produto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");//mensagem
        num1 = sc.nextInt(); //entrada
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        produto = num1*num2;
        System.out.println("produto = " + produto);
        sc.close();
    }
}
