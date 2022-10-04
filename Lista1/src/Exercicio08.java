import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float RC, RH, RM, IR = 0, RL = 0, H = 0;
		String aliquota = "";

		System.out.println("Bom dia , informar a renda do Homem");
		RH = scan.nextInt();
		System.out.println("Informe a renda da mulher");
		RM = scan.nextInt();

		RC = RH + RM;

		if (RC <= 900.00) {
			aliquota = "isento";
			IR = 0;
			RC = RC - IR;

		} else if (RC <= 1500.00) {
			aliquota = "10.0";
			H = Float.parseFloat("10.0");
			IR = RC * H / 100;
			RL = RC - IR;

		} else if (RC <= 2500.00) {
			aliquota = "15.0";
			H = Float.parseFloat("15.0");
			IR = RC * H / 100;
			RL = RC - IR;
		} else {
			aliquota = "25.0";
			H = Float.parseFloat("25.0");
			IR = RC * H / 100;
			RL = RC - IR;

		}

		System.out.println("Renda conjunta :" + RC);
		System.out.println("Aliquota :" + aliquota );
		System.out.println("Imposto de renda:" + IR);
		System.out.format("Renda liquida :" + RL);

	}
}
