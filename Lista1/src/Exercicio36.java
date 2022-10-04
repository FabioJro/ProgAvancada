
import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Favor nos informe a quantidade de HO,HO!");
        int quant = scan.nextInt();
        
        for (int i =0 ; i< quant-1 ; i++) {
        	
        	System.out.print("HO ");
        }
        
		System.out.println("HO!");
	}
}
