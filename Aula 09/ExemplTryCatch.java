import java.util.Scanner;

public class ExemplTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = sc.nextInt();
            int soma = n1+ n2;
            System.out.println("A soma é: " + soma);
        } catch (Exception e) {
            System.out.println("Valor digitado incorretamente!!" + e);
        }
    }
}
