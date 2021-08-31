public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println("t: " + t + " f: " + f);
        System.out.println("t || f = " + (t || f)); // t ou f
        System.out.println("t && f = " + (t && f)); // t e f
        System.out.println("!t = " + (!t)); // não t
        System.out.println("!f = " + (!f)); // não f  
        System.out.println("t && !f = " + (t && !f)); // t e !f
    }
}
