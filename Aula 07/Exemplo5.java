import javax.swing.JOptionPane;

public class Exemplo5 {
    public static void main(String[] args) {
        double vCompra, parcela;
        int qtParcelas, juros;
        vCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra R$: "));
        qtParcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas: "));

        switch(qtParcelas){
            case 2:
                juros = 3;
                break;
            case 4:
                juros = 7;
                break;
            case 6:
                juros = 9;
                break;
            case 8:
                juros = 12;
                break;
            default:
                juros = -1;
        }

        if(juros == -1){
            JOptionPane.showMessageDialog(null, "Opção de parcelamento inválida!");
        }
        else{
            vCompra += (vCompra * juros)/100;
            parcela = vCompra/qtParcelas;
            JOptionPane.showMessageDialog(null, "Sua compra terá parcelas de R$" + parcela);
        }
    }
}
