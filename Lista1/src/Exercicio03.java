import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Informe o seu salario fixo");
		double salarioFixo = scan.nextDouble();
		System.out.println("Informe o total de vendas em R$");
		double vendas = scan.nextDouble();
		
		double comissao = vendas*15/100;
		
		double salarioFinal = comissao+ salarioFixo;
		
		System.out.println("Seu salario final é :  R$"+salarioFinal);
	}

}
