
import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros;
		String ganhou = "";
		System.out.println("Favor nos informe o seu nome ");
		String nome1 = scan.next();
		System.out.println("Informe se ira escolher par ou impar");
		String escolha1 = scan.next();
		System.out.println("Informe o numero");
		int numero1 = scan.nextInt();
		System.out.println("Favor informe o seu nome");
		String nome2 = scan.next();
		System.out.println("Informe se ira escolher par ou impar");
		String escolha2 = scan.next();
		System.out.println("Informe o numero");
		int numero2 = scan.nextInt();

		numeros = (numero1 + numero2) % 2;

		if (numeros == 0) {

			ganhou = "Par";
			
		} else {
			
			ganhou = "Impar";
		}

		if (escolha1.equalsIgnoreCase(ganhou)) {

			System.out.println(nome1);
			
		} else {

			System.out.println(nome2);
		}

	}
}
