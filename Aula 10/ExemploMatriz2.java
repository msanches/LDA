public class ExemploMatriz2 {
    public static void main(String[] args) {
        String[][] nome = new String[5][2];
        nome[0][0] = "Marco"; 
        nome[0][1] = "Daniel"; 
        nome[1][0] = "Ana"; 
        nome[1][1] = "Paula";
        
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                System.out.print(nome[i][j]+"\t");
            }
            System.out.println();
        }
    }
}