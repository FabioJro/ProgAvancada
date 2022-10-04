import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a cidade que voce reside");
		System.out.println("Utilizar nomeclatura abaixo para as cidades");
		System.out.println("Santa Ana ------ S");
		System.out.println("Tabatinga ------ T");
		System.out.println("Industricas ---- I");
		String cidade = scan.next();
		System.out.println("Informe a renda de sua familia ");
		int renda = scan.nextInt();
		if (cidade.equalsIgnoreCase("I") || cidade.equalsIgnoreCase("S") || cidade.equalsIgnoreCase("T"))
			switch (cidade) {

			case "I":
				Renda_industrias(renda);
			}
	}

	public static int Renda_industrias(int x) {

		if (x == 240 && x <= 1000) {

			return x-240;

		}else if (x>1000 && x <=5000) {
			
          return x-120;
		}else return x;
		  
	}

}
