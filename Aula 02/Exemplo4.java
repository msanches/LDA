import javax.swing.JOptionPane;
/**
 * @author marco
 */
public class Exemplo4 {
    public static void main(String[] args) {
        String modelo;
        int quilometragem;
        float valor;
        modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo:");
        quilometragem = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                           "Digite a quilometragem do veículo: "));
        valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do veículo R$"));
        JOptionPane.showMessageDialog(null, "Dados do veículo: \n Modelo: " +
                                      modelo +"\n Quilometragem: " +
                                      quilometragem + "km\n Valor: R$ " + valor);
    }
}


