import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempo , HH=0,MM=0,SS=0;
		System.out.println("Os segundos para sair em horas");
		tempo = scan.nextInt();

		HH = tempo/3600;
		MM = ((tempo%3600)/60);
		SS = ((tempo%3600)%60);
		
		System.out.println("HH:MM:SS = "+HH+":"+MM+":"+SS);
		

	}
}
