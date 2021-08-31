public class OperadoresJava {
    public static void main(String[] args) {
        int a = 1, b = 10;
        a++; //equivale a: a = a + 1
        b--; //equivale a: b = b - 1 
        System.out.println("Incremento: a++ = " + a);
        System.out.println("Decremento: b-- = " + b);
        int c = b%a;//o resultado é resto da divisão de b por a
        System.out.println("b % a = " + c);
        a += 10; //soma 10 unidades 
        b *= 2; // multiplica por 2
        System.out.println("a = " + a + "\nb = " + b);
    }
}
