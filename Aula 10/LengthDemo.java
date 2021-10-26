public class LengthDemo {
    public static void main(String[] args) {
        int[] lista = new int[10];
        int[] numeros = {1, 2, 3, 4};
        int[][] tabela = {//tabela de tamanho variável
                {1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("Tamanho da lista: " + lista.length);
        System.out.println("Tamanho de números: " + numeros.length);
        //Tamanho da tabela nas linhas 0, 1 e 2
        System.out.println("Tamanho da tabela[0]: " + tabela[0].length);
        System.out.println("Tamanho da tabela[1]: " + tabela[1].length);
        System.out.println("Tamanho da tabela[2]: " + tabela[2].length);
    }
}
