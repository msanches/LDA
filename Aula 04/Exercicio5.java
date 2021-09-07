import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float maior, num1, num2, num3;
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextFloat();
        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextFloat();
        System.out.printf("Entrada: x= %.0f | y= %.0f | z = %.0f\n", num1, num2, num3);
        maior = (num1 + num2)/2 + Math.abs((num1 - num2)/2);
        maior = (maior + num3)/2 + Math.abs((maior - num3)/2);
        System.out.println("Saída: ");
        System.out.printf("O maior inteiro é: %.0f \n", maior);
        sc.close();
    }
}