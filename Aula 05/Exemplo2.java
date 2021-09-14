import javax.swing.*;
public class Exemplo2 {
    public static void main(String[] args) {
        int resp;
        int n1, n2;
        //Chamamos o método soma passando os valores de parâmetros
        //É obrigatório tratar o retorno. Podemos imprimir diretamente ou guardar em uma variável
        JOptionPane.showMessageDialog(null, "A soma é:" + soma(2,2));
        resp = soma(5,5);
        JOptionPane.showMessageDialog(null, "A soma é:" + resp);
        //Podemos ainda reutilizar o método, passando outros valores como parâmetros
        n1 = 10;
        n2 = 20;
        JOptionPane.showMessageDialog(null, "A soma é:" + soma(n1,n2));
    }
    public static int soma(int a, int b) {
        int resposta;
        resposta = a + b;
        return resposta;
    }
}