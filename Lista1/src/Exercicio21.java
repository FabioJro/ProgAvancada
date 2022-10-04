import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double maior_velo = 0 , media =0 , maior_ano=0;
		System.out.println("Informe a quantidade");
		int quant = scan.nextInt();
		int anos[] = new int[quant];
		double vel[]= new double[quant];
		System.out.println("Informe os anos");
		for (int i = 0; i < quant; i++) {

			anos[i] = scan.nextInt();

			if (anos[i] > maior_ano) {

				maior_ano = anos[i];

			}
		}
		
		System.out.println("Informe as velocidades dos carros ");
		for (int i = 0; i < quant; i++) {

			vel[i] = scan.nextDouble();
    
			if (vel[i] > maior_velo) {

				maior_velo = vel[i];

			}
			
			media = vel[i]/quant;
		}

		System.out.println("O carro mais novo tem"+ maior_ano +"anos");
		System.out.format("A maior velocidade é " +"%2.f", maior_velo);
		System.out.format("A velocidade media é "+"%2.f", media);
		
		
	}

	
		

	
	
	

		
		
		
	

}
