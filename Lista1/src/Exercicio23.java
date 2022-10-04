import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2;

		System.out.println("Informe o primeiro numero");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo numero");
		num2 = scan.nextInt();
		
		Maior(num1,num2);
		Igual(num1,num2);
		Menor(num1,num2);	
		Diferente(num1,num2);
		Maior_igual(num1,num2);
		Menor_igual(num1,num2);
		
		

	}

	public static void Maior(int x, int y) {

		if (x > y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Menor(int x, int y) {

		if (x < y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Igual(int x, int y) {

		if (x == y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Maior_igual(int x, int y) {

		if (x >= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Menor_igual(int x, int y) {

		if (x <= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
	public static void Diferente(int x, int y) {

		if (x != y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
