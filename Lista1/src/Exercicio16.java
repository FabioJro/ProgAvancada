import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double PopA, PopB;
		int Anos = 0;
		do {
			System.out.println("Informe a popula��o da cidade A");
			PopA = scan.nextDouble();
			System.out.println("Informe a popula��o da cidade B");
			PopB = scan.nextDouble();

			if (PopB < PopA) {
				System.out.println("Favor informar valor que B seja maior que A");
			} else {
				while (PopA < PopB) {
					PopA += PopA * 0.03;
					PopB += PopB * 0.015;
					Anos++;

				}

				System.out.println("A popula��o A ir� demorar " + Anos + " anos para ser maior que a popula��o B");

			}
		} while (PopA > PopB);
		scan.close();
	}
}