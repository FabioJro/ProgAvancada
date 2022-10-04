import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> numeros = new LinkedList<>();
		System.out.println("Informe os numeros");
		for (int i = 0; i < 3; i++) {

			int adicionar = scan.nextInt();

			numeros.add(adicionar);
		}

		Collections.sort(numeros);
		
		System.out.println("Numeros arrumados");
		for (int i = 0; i < 3; i++) {
			System.out.println(numeros.get(i));
		}
		scan.close();
	}

}
