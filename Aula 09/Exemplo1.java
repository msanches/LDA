import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        int num, digitos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = sc.nextInt();
        digitos = String.valueOf(num).length();
        System.out.println("O número " + num + " tem " + digitos + " digitos");
    }
}