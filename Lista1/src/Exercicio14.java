import java.util.Scanner;
public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o numero desejado");
        int Numero = scan.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (Numero % 2 == 1) {
        		System.out.println(Numero);
        		cont++;
        	}
    		Numero++;
        }
		scan.close();
	}

}
