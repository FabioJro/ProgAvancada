

public class Exercicio47 {
	public static void main(String[] args) {
		int numero = 1, anterior = 0;
		for (int i = 0; i < 20; i++) {

			if (numero == 1) {
				System.out.print(numero);
				numero = numero * 3;
				anterior = numero;
			} else {
				System.out.print(" ");
				System.out.print(numero);
				numero = anterior * numero;
			}

		}

	}

}
