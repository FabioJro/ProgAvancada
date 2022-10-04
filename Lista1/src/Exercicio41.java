
import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float emagrecer, engorde;
		System.out.println("Favor nos informe a sua altura");
		float altura = scan.nextFloat();

		System.out.println("Favor nos informe o seu peso");
		float peso = scan.nextFloat();

		if (altura <= 1.50) {
			if (peso < 50) {
				engorde = 50 - peso;
				System.out.println("Engorde " + engorde+"Kg");
			} else if (peso == 50) {
				System.out.println("Parabens você está no peso ideal");
			} else {
				emagrecer = peso - 50;
				System.out.println("Emagreca " + emagrecer+"Kg");
			}

		} else if (altura <= 1.90) {

			if (peso < 70) {
				engorde = 70 - peso;
				System.out.println("Engorde " + engorde+"Kg");
			} else if (peso == 70) {
				System.out.println("Parabens você está no peso ideal");
			} else {
				emagrecer = peso - 70;
				System.out.println("Emagreca " + emagrecer+"Kg");
			}

		} else {

			if (peso < 100) {
				engorde = 100 - peso;
				System.out.println("Engorde " + engorde+"Kg");
			} else if (peso == 100) {

				System.out.println("Parabens você está no peso ideal");

			} else {
				emagrecer = peso - 100;
				System.out.println("Emagreca " + emagrecer +"Kg");
			}
		}
	}

}
