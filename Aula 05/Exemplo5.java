import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        float base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a base do triângulo em cm?");
        base = sc.nextFloat();
        System.out.println("Qual a altura do triângulo em cm?");
        altura = sc.nextFloat();
        System.out.printf("A área do triâgulo é %.2f", area(base, altura));
        System.out.printf("A área do triâgulo é %.2f", area(80, 10));
        System.out.printf("A área do triâgulo é %.2f", area(15, 8));
        sc.close();
    }
    public static float area(float b, float h){
        float area;
        area = b*h/2;
        return area;
    }
}