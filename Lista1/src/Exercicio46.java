
import java.util.Scanner;

public class Exercicio46 {

	public static int Fatorial(int num){
	
		   if((num==1) || (num==0)){
		      return 1;}
		   else {
		      return Fatorial(num-1)*num;
		
	}
		   }

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int primeiro=0 , segundo =0,somaFato;
		System.out.println("Informe o os numeros a serem feitos fatoriais e somados");
		primeiro = scan.nextInt();
		segundo = scan.nextInt();
		
		
		somaFato = Fatorial(primeiro)+Fatorial(segundo);

		System.out.println("A soma dos fatoriais sao : "+somaFato);
		
		

	}

}
