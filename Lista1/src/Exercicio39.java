
import java.util.Scanner;

public class Exercicio39 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
        System.out.println("Informe o numero para sair sua taboada");
		int numero= scan.nextInt();
		System.out.println("Taboada do numero "+ numero);
		for (int i = 0 ; i < 10 ; i++) {
			int multiplo = i*numero;
			
			System.out.println( numero + "x"+ i +"="+ multiplo);
		}
		
		
	}

}
