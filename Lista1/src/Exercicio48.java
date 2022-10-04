
import java.util.Scanner;

public class Exercicio48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float dosagem;
		System.out.println("Informe sua idade");
		int idade = scan.nextInt();
		System.out.println("Informe o seu peso");
		double peso = scan.nextDouble();

		if (idade < 12) {
			if ((peso > 5) && (peso < 9)) {
				dosagem = 125;
			} else if ((peso > 9.1) && (peso < 16)) {
				dosagem = 250;
			} else if ((peso > 16.1) && (peso < 24)) {
				dosagem = 375;
			} else if ((peso > 24.1) && (peso < 30)) {
				dosagem = 500;
			} else {
				dosagem = 750;
			}
		} else {
			if (peso >= 60) {
				dosagem = 1000;
			} else {
				dosagem = 875;
			}
		}
		
		double gotas = (20*dosagem)/500;
		
		System.out.println("Deve tomar "+ gotas + " gotas");
		
	}
}
