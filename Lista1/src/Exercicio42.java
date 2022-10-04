
import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		float presao_anterior, presao_apos,aumento;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores dos ingressos seguindo as regras");
		Regras();
		System.out.println("");
		System.out.println("Informe o preco do ingresso antes");
		presao_anterior = scan.nextFloat();

		System.out.println("Informe o preco do ingresso apos");
		presao_apos = scan.nextFloat();
		if ((presao_anterior > 0) && (presao_apos > presao_anterior) && (presao_apos < 1000.00)) {
			
			aumento = (presao_anterior / presao_apos) * 100;

			System.out.println("O preco aumentou em torno de " +  aumento + "%");

		} else {

			do {
				System.out.println("Informe os valores que sejam corretos, seguindo as regras.");
				Regras();
				

				System.out.println("Informe o preco do ingresso antes");
				presao_anterior = scan.nextFloat();

				System.out.println("Informe o preco do ingresso apos");
				presao_apos = scan.nextFloat();

			} while ((presao_anterior < 0) || (presao_apos < presao_anterior) || (presao_apos > 1000.00));

			aumento = (presao_anterior / presao_apos) * 100;

			System.out.println("O preco aumentou em torno de " +  aumento + "%");

		}

	}
	
	public static void Regras() {
		System.out.println("1.Preco anteior tem que ser maior que R$00,00");
		System.out.println("2.Preco anteior tem que ser menor que preco apos");
		System.out.println("3.Preco apos menor que R$1000,00");
		
	}
}
