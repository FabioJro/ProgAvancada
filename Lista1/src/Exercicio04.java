import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numeros[] = new int[3];
		int maior = 0, menor = 0;

		System.out.println("Informe os numeros");

		for (int i = 0; i < numeros.length; i++) {
			 numeros[i]=scan.nextInt();

			if (i == 0) {

				maior = numeros[i];
				menor = numeros[i];

			} else if (menor > numeros[i]) {

				menor = numeros[i];
			} else {
				maior = numeros[i];
			}

		}
		
		System.out.println("O maior numero é : " +maior);
		System.out.println("O menor numero é : " +menor);
	}

}
