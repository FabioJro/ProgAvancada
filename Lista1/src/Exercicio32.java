import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int escolha;
		float gaso, alc, disel, som_alc=0, som_dis=0, som_gaso=0;
		do {
			System.out.println("Informe qual o tipo  de  combustivel");
			System.out.println("1. Álcool ");
			System.out.println("2. Gasolina ");
			System.out.println("3. Diesel");
			System.out.println("4. Encerrar");
			escolha = scan.nextInt();
			if (escolha > 4 || escolha < 1) {
				System.out.println();
			}
			switch (escolha) {

			case 1:
				System.out.println("Quantos litros de Álcool?");
				alc = scan.nextFloat();
				som_alc = alc + alc;
				break;

			case 2:
				System.out.println("Quantos litros de Gasolina");
				gaso = scan.nextFloat();
				som_gaso = gaso + gaso;
				break;
				
			case 3:
				System.out.println("Quantos litros de Álcool?");
				disel = scan.nextFloat();
				som_dis = disel + disel;
				break;
				
			default:
				System.out.println("Sitema encerrado");
				
				
			}

		} while (escolha != 4);
		
		System.out.println("Soma dos totais");
		System.out.println("Álcool "+ som_alc);
		System.out.println("Gasolina " + som_gaso);
		System.out.println("Disel " + som_dis);
	}

}
