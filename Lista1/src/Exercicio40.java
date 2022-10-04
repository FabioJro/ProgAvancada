
import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soma1, soma2, soma3;
		System.out.println("Informe os lados do triangulo");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		soma1 = lado1 + lado2;
		soma2 = lado2 + lado3;
		soma3 = lado1 + lado3;
		if (lado3 > soma1) {
			System.out.println("Informe numero corretos");
		} else if (lado1 > soma2) {

			System.out.println("Informe numero corretos");

		} else if (lado2 > soma3) {

			System.out.println("Informe numero corretos");
		}else

			
			if (lado1 == lado2 && lado1 == lado3) {

				System.out.println("Equilaero");

			} else if (lado1 == lado2 && lado1 != lado3) {

				System.out.println("Isósceles");

			} else {

				System.out.println("Escaleno");
			}

	}
}
