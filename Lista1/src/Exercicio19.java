import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Favor nos informe o seu salario");
		double salario = scan.nextDouble();

		if (salario <= 300) {
			salario += salario * 0.05;
		} else if (salario <= 500) {
			salario += salario * 0.07;
		} else {

			salario += salario * 0.10;
		}

		System.out.format("Seu novo salario é "+ "%.2f", salario);
	}

}
