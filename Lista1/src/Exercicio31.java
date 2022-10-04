import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float nota1,nota2,media;
		do {
			System.out.println("Informe a sua primeira nota");
			nota1 = scan.nextFloat();
            if (nota1 <0 && nota1 >10) {
            	System.out.println("Nota invalida");
            }
		} while (nota1 <0 && nota1 >10);
		do {
			System.out.println("Informe a sua primeira nota");
			nota2 = scan.nextFloat();
            if (nota2 <0&& nota2 >10) {
            	System.out.println("Nota invalida");
            }
		} while (nota2 < 0 && nota2 >10);
		media = (nota1+nota2)/2;
		System.out.println("Sua media é :"+ media);
        scan.close();
	}

}
