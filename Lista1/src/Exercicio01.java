import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua primeira nota");
		float nota1 =scan.nextFloat();
		System.out.println("Infrome a sua segunda nota");
		float nota2 = scan.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		System.out.println("Sua media e :"+ media);
		scan.close();
	}

}
