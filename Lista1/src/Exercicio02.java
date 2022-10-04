import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe o seu numero");
		int numero = scan.nextInt();
		System.out.println("Informe numero de horas trabalhadas");
		int horaTrab = scan.nextInt();
		System.out.println("Informe o valor recebido por hora trabalhadas");
		double recebimento = scan.nextDouble();
		
	    double salario = horaTrab * recebimento;
	    
	    System.out.println("Numero "+numero);
	    System.out.println("O seu salario é :  R$"+salario);
	}

}
