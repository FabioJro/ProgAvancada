import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int conta = 0, consumo = 0;
		do {
		System.out.println("Informe o consumo de agua de sua casa");
		System.out.println("Lembre-se da regra : consumo menor que 1000");
		consumo = scan.nextInt();
		if (consumo <= 10) {
			conta = 7;
		} else if (consumo <= 30) {
			
			conta = (consumo - 10) * 1 + 7;
			
		} else if (consumo <= 100) {
			
			conta = (consumo - 30) * 2 + 27;
			
		} else {
			
			conta = (consumo - 100) * 5 + 167;
			
		}
		}while(consumo>1000);

		System.out.println("A sua conta deu : R$" + conta);
	}

}
