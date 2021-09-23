import java.util.Scanner;
 
public class Exemplo7 {
    public static void main(String[] args){
        float num1, num2, result;
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextFloat();
        System.out.println("Informe o segundo número: ");
        num2 = sc.nextFloat();

        System.out.println("Digite a operação desejada: \n1- Soma \n2- Subtração\n3- Multiplicação\n4- Divisão\n ");
        opcao = sc.nextInt();
        if(opcao == 1){
            result = num1 + num2;
            System.out.printf("A soma entre %.2f e %.2f é igual a %.2f", num1, num2, result);
        }
        if(opcao == 2){
            result = num1 - num2;
            System.out.printf("A subtração entre %.2f e %.2f é igual a %.2f", num1, num2, result);
        }
        if(opcao == 3){
            result = num1 * num2;
            System.out.printf("A multiplicação entre %.2f e %.2f é igual a %.2f", num1, num2, result);
        }
        if(opcao == 4 && num2 !=0){
            result = num1 / num2;
            System.out.printf("A divisão entre %.2f e %.2f é igual a %.2f", num1, num2, result);
        }
        sc.close();
    }
}