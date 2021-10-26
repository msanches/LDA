import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        float[] salario = new float[10];
        int i, menores=0;
        float soma=0, media, maiorSalario;
        for(i=0; i<10; i++){
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"º salário"));
        }
        for(i=0; i<10; i++){
            soma += salario[i];
        }
        media = soma/10;
        System.out.println("Média dos salários = " + media);

        maiorSalario = salario[0];
        for(i=0; i<10; i++){
            if(salario[i] > maiorSalario)
                maiorSalario = salario[i];
        }
        System.out.println("O maior salário é: " + maiorSalario);
        for(i=0; i<10; i++){
            if(salario[i] < 850)
                menores++;
        }
        System.out.println("Quantidade de salários menores que R$ 850 = " + menores);
    }
}
/*
i=0 => salario[0] = 900
i=1 => salario[1] = 1200
i=2 => salario[2] = 1500
i=3 => salario[3] = 650

maiorSalario = 900
i=0 => salario[0] > maiorSalario (F)
i=1 => salario[1] > maiorSalario (V) => maiorSalario = 1200
i=2 => salario[2] > maiorSalario (V) => maiorSalario = 1500
i=3 => salario[3] > maiorSalario (F)

O maior salário é 1500
*/
