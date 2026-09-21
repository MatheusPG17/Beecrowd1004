
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A, B, PROD;
        
        A = leia.nextInt();
        B = leia.nextInt();
        
        PROD = (A * B);
        
        System.out.println("PROD = " + PROD);
        
    }
}
