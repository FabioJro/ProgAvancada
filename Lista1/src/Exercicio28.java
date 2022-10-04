
public class Exercicio28 {
	public static void main(String[] args) {

		int num1, num2;
		num1 = 1;
		num2 = 60;

		for (num1 = 1, num2 = 60; num2 <= 60; num1 += 3, num2 -= 5) {
			System.out.println("I =" + num1 + " J = "+ num2);
			if (num2 == 0)
				break;
		}

	}

}
