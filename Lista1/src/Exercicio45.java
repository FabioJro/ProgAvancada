
import java.util.Scanner;

public class Exercicio45 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cont = 0;
		float mediaDasIdades = 0, somaIdades=0;

		String[] nomes = new String[5];
		float[] idades = new float[5];
		float idadeMaisNova = 0;
		String nomeDaPessoaMaisNova = "";
		float idadeMaisVelha = 0;

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome: ");
			nomes[i] = scan.next();
			System.out.println("Digite a idade:");
			idades[i] = scan.nextInt();
			cont++;
			somaIdades += idades[i];
		}

		for (int i = 0; i < nomes.length; i++) {
			if (i == 0) {
				idadeMaisNova = idades[i];
				nomeDaPessoaMaisNova = nomes[i];
				idadeMaisVelha = idades[i];

			} else if (idades[i] < idadeMaisNova) {
				idadeMaisNova = idades[i];
				nomeDaPessoaMaisNova = nomes[i];
			} else {
				idadeMaisVelha = idades[i];

			}
		}
		mediaDasIdades = somaIdades/cont;
		
		System.out.println("Pessoa Mais nova Nome: " + nomeDaPessoaMaisNova);
		System.out.println("Pessoa Mais velha Idade: " + idadeMaisVelha);
		System.out.println("Medias das idades: " + mediaDasIdades );
	}

}
