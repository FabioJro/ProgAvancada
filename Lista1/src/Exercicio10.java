import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Tempo , Anos =0 , Meses = 0 , Dias=0;
		System.out.println("Informe a quantidade de dias para sair o total desejado");
		Tempo = scan.nextInt();

		Anos = Tempo/365;
		Meses = ((Tempo%365)/30);
		Dias= ((Tempo%365)%30);
		
		System.out.println("Ano(os)"+ Anos);
		System.out.println("Mes(es)"+ Meses);
		System.out.println("Dia(as)"+ Dias);
		scan.close();
		

	}

}
