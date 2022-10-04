import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Glicose[] = new int[4];
		float Total = 0;

		System.out.println("Informe as 4 medições diarias da glicose");
		for (int i = 0; i < Glicose.length; i++) {

			Glicose[i] = scan.nextInt();

			Total = Glicose[i] + Glicose[i];

		}

		for (int i : Glicose) {

			if (i < 110) {

				System.out.println(i + " Normal");
			} else if (i >= 100 && i < 125) {

				System.out.println(i + " Aleterada");

			} else {

				System.out.println(i + " Muito Alta");
			}

		}
		
		System.out.println("Media da glicose "+ Total/Glicose.length);

	}

}
