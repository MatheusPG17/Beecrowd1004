
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Variaveis
        int A, B, PROD;
        //Entrada de dados
        A = leia.nextInt();
        B = leia.nextInt();
        //Processamento
        PROD = (A * B);
        //Saida de dados
        System.out.println("PROD = " + PROD);
        
    }
}
