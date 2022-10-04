
import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2;

		System.out.println("Informe o primeiro numero");
		num1 = scan.nextInt();
		System.out.println("Infrome o segundo numero");
		num2 = scan.nextInt();
		if ((1 < num1) && (num1 < 20) && (num2 < 10000)) {
			for (int i = 1; i <= num2; i++) {

				System.out.println(i);
				if (i % num1 == 0) {
					System.out.println("");

				}
			}

		}else {
			System.out.println("Numero informado invalido");
		}
	}

}
