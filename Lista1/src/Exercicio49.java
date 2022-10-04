
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o seu peso");
		float peso = scan.nextFloat();
		System.out.println("Informe sua altura");
		float altura = scan.nextFloat();

		float IMC = peso / (altura * altura);
		System.out.print("IMC " +IMC +" - ");
		Teste(IMC);
		
		
	}

	public static void Teste(float x) {

		if (x < 20) {
			System.out.println("Abaixo do peso");
		} else if (x < 25) {
			System.out.println("Peso Normal");
		} else if (x < 30) {
			System.out.println("Sobrepeso");
		} else if (x < 40) {
			System.out.println("Obeso");
		} else {
			System.out.println("Obeso Morbido");
		}

	}

}
