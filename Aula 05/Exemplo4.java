import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        float largura, altura, profundidade;
        largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a largura da caixa em cm?"));
        profundidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a profundidade da caixa em cm?"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a altura da caixa em cm?"));
        volumeCaixa(largura,profundidade,altura);
    }
    public static void volumeCaixa(float l, float p, float h){
        float volume;
        volume = l/100 * p/100 * h/100;
        JOptionPane.showMessageDialog(null, String.format("O volume da caixa é %.2f m³", volume ));
    }
}
