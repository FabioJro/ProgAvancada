
import java.util.Scanner;
public class Exercicio38 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
        System.out.println("Informe o numero");
		int numero= scan.nextInt();
		
		if(numero%2==0) {
			
			System.out.println("Não é primo");
		}else {
			System.out.println("Numero é primo");
		}
	}

}
