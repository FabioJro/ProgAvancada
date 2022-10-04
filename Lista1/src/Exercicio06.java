import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
		float Litros, Total;
		int Kilometros;

		System.out.println("Favor nos informar a quatidade de litros utilizado na viagem");
	    Litros = scan.nextFloat();
	    System.out.println("Inform a kilometragem");
	    Kilometros = scan.nextInt();
	    
	    Total = Kilometros/Litros;
	    
	    System.out.format("Total de km/l :" +"%.2f", Total);
	
		scan.close();
	}
}
