import java.util.Scanner;

public class Exercicio15 {
	public static int fib(int n) {
		if (n == 0)
			return n;
		else if (n <= 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		for (int i = 0; i < numero; i++) {
			
			System.out.println(fib(i));
		}
		scan.close();
	}
	

}
