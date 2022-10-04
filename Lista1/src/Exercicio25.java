import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int final1 = 0, final2 = 0, final3 = 0;
		System.out.println("Bem vindo, lembrando que 1 = verdadeiro e 0= falso .");
		System.out.println("Favor informar os seguintes topicos");
		System.out.println("Seu trabalho possui Interface gráfica");
		int num1 = scan.nextInt();
		System.out.println("Seu trabalho possui Inteligência Artificial");
		int num2 = scan.nextInt();
		System.out.println("Seu trabalho possui Encapsulamento");
		int num3 = scan.nextInt();

		System.out.println("Seu trabalho possui Indentação");
		int num4 = scan.nextInt();
		System.out.println("Seu trabalho possui Structs");
		int num5 = scan.nextInt();

		if (num1 == 1 || num1 == 0 || num2 == 1 || num2 == 0) {

			final1 = 1;

		}
		if (num3 == 1 && num4 == 1) {

			final2 = 1;
		} else {
			final2 = 0;
		}

		if (num5 == 1) {

			final3 = 1;
		} else {
			final3 = 0;
		}

		if (final1 == 1 && final2 == 1 && final3 == 1) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
