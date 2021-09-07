import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1, x2, y1, y2, distancia;
        System.out.println("Coordenada x do ponto 1:");
        x1 = sc.nextFloat();
        System.out.println("Coordenada y do ponto 1:");
        y1 = sc.nextFloat();
        System.out.println("Coordenada x do ponto 2:");
        x2 = sc.nextFloat();
        System.out.println("Coordenada y do ponto 2:");
        y2 = sc.nextFloat();
        distancia = (float) Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.printf("A distância entre os pontos é %.4f\n", distancia);
        sc.close();
    }
}
