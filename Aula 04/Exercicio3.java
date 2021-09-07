import java.util.Scanner;;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float salario, vendas, total;
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Salário fixo: ");
        salario = sc.nextFloat();
        System.out.println("Vendas: ");
        vendas = sc.nextFloat();
        total = salario + (vendas * 5/100);
        System.out.printf("%s deve receber R$ %.2f\n", nome, total);
        sc.close();
    }
}
