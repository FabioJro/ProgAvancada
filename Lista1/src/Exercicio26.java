

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cont = 0;
		System.out.println("Informe a sua altura");
		float Altura = scan.nextFloat();
		System.out.println("Informe a sua idade");
		int Idade = scan.nextInt();

		if (Altura >= 1.5 && Idade >= 12) {

			cont++;

		}

		if (Altura >= 1.4 && Idade >= 14) {

			cont++;
		}
		
		if (Altura >= 1.7 && Idade >= 16) {

			cont++;
		}

		System.out.println("Voce pode brincar em :" + cont);

	}

}
