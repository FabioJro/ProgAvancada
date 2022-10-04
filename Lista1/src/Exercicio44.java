
import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numeros[] = new double[5];
		int impar = 0;
		double media_impar = 0, num_impar = 0, maior_par = 0, menor = 0, maior = 0, diferenca, help = 0;

		System.out.println("Informe os numeros que irá fazer parte da coleção");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scan.nextDouble();

			if (numeros[i] % 2 == 0) {

				if (maior_par < numeros[i]) {

					maior_par = numeros[i];
				}

			} else if (numeros[i] % 2 != 0) {

				num_impar += numeros[i];

				impar++;

			}
			if (i == 0) {
				maior = numeros[i];
				menor = numeros[i];

			}

			else if (numeros[i] < menor) {
				menor = numeros[i];

			} else {

				maior = numeros[i];
			}

		}

		media_impar = num_impar / impar;
		diferenca = maior - menor;
		System.out.println("Media dos Impares " + media_impar);
		System.out.println("Maior numero PAR " + maior_par);
		System.out.println("Diferenca " + diferenca);

	}

}
