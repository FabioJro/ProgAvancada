import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		String contrario = "";

		System.out.println("Digite uma palavra para verificar se � um pal�ndromo");
		String nome = ent.nextLine();

		for (int i = (nome.length() - 1); i >= 0; i--) {
			contrario = contrario + nome.charAt(i);
		}

		if (contrario.toLowerCase().equals(nome.toLowerCase())) {
			System.out.println("\n\n\t\tEssa palavra � pal�ndromo :)");
		} else {
			System.out.println("\n\n\t\tEssa palavra n�o � pal�ndromo :(");
		}

	}
}
