import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quatidade de numeros a serem testados");
		int Quantidade = scan.nextInt();

		int Numeros[] = new int[Quantidade];

		System.out.println("Informe os numeros a serem verificados");
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = scan.nextInt();
		}
		
		for(int i : Numeros) {
			
			if (i%2==0) {
			
				System.out.println("O numero "+i+ " � par");
				
			}else {
				System.out.println("O numero "+i+ " � impar");
			}
		}
		scan.close();
	}

}
