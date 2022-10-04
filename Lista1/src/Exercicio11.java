import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Informe o horario inicio da partida");
		 int Inicio = scan.nextInt();
		 System.out.println("Informe o horario fim da partida");
		 int Fim = scan.nextInt();
		 int Duracao= 24 - (24+ Inicio -Fim) %24;
		 if (Inicio == Fim ) {
			 
			 System.out.println("O jogo durou 24hr");
		 }else {
			 
			 System.out.println("O jogo durou " +Duracao+" hr");
		 }
		
		 scan.close();
	}

}
