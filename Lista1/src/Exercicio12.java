import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Primeiro_menu();
		String Palavra1 = scan.next();

		if (Palavra1.equalsIgnoreCase("Vertebrado")) {
			Menu_vertebrado_1();
			String Palavra2 = scan.next();
			if (Palavra2.equalsIgnoreCase("Ave")) {
				Menu_vertebrado_2();
				String Palavra3 = scan.next();
				if (Palavra3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Águia");
				} else if (Palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Pomba");
				}
			} else if (Palavra2.equalsIgnoreCase("Mamifero")) {
				Menu_vertebrado_3();
				String Palavra3 = scan.next();
				if (Palavra3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Vaca");
				} else if (Palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				}

			}
		} else if (Palavra1.equalsIgnoreCase("Invertebrado")) {
			Menu_invertebrado_1();
			String Palavra2 = scan.next();
			if (Palavra2.equalsIgnoreCase("Inseto")) {
				Menu_invertebrado_2();
				String Palavra3 = scan.next();
				if (Palavra3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				} else if (Palavra3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Lagarta");
				}
			} else if (Palavra2.equalsIgnoreCase("Anelideo")) {
				Menu_invertebrado_3();
				String Palavra3 = scan.next();
				if (Palavra3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguesuga");
				} else if (Palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Minhoca");
				}

			}
		}

	}

	public static void Primeiro_menu() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Vertebrado");
		System.out.println("Invertebrado");
		System.out.println("-----------------------------");

	}

	public static void Menu_vertebrado_1() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Ave");
		System.out.println("Mamifero");
		System.out.println("-----------------------------");

	}

	public static void Menu_invertebrado_1() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Inseto");
		System.out.println("Anelídeo");
		System.out.println("-----------------------------");

	}

	public static void Menu_vertebrado_2() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Carnivoro");
		System.out.println("Onívoro");
		System.out.println("-----------------------------");

	}

	public static void Menu_vertebrado_3() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Herbivoro");
		System.out.println("Onívoro");
		System.out.println("-----------------------------");

	}

	public static void Menu_invertebrado_2() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Herbívoro");
		System.out.println("Hematofago");
		System.out.println("-----------------------------");

	}

	public static void Menu_invertebrado_3() {
		System.out.println("-----------------------------");
		System.out.println("Escolha entre os itens abaixo");
		System.out.println("Onivoro");
		System.out.println("Hematofago");
		System.out.println("-----------------------------");

	}
}
