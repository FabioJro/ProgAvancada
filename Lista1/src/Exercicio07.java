import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0, troco=0;

		System.out.println("Informe o numero a ser dividido em celudas menores");
		numero = scan.nextInt();

		troco = numero;

		cem = troco / 100;

		troco = troco - (cem *100);

		cinquenta = troco / 50;

		troco = troco - (cinquenta * 50);

		vinte = troco / 20;

		troco = troco - (vinte * 20);

		dez = troco /10;

		troco = troco -(dez * 10);

		cinco = troco / 5;

		troco = troco - (cinco * 5);

		dois = troco / 2;

		troco = troco - (dois * 2);
		
		um = troco/1;
		troco = troco -(um*1);
		
		System.out.println(cem + "nota(s) de R$ 100,00");
		System.out.println(cinquenta+ "nota(s) de R$ 50,00");
		System.out.println(vinte+ "nota(s) de R$ 20,00");
		System.out.println(dez+ "nota(s) de R$ 10,00");
		System.out.println(cinco+"nota(s) de R$ 5,00");
		System.out.println(dois+"nota(s) de R$ 2,00");
		System.out.println(um+"nota(s) de R$ 1,00");
		scan.close();

	}
}
