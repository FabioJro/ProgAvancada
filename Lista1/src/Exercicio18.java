import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o numero para sair reverso");
		int numero = scan.nextInt();
		int i = 0;
		while (numero > 0) {
			i *= 10;
			i += (numero % 10);
			numero /= 10;
		}
		
		System.out.println("Numero invertido "+ i);

	}

}
