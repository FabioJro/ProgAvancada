
import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio50 {
	
	public static void main(String[] args) {
        
        ArrayList<Integer> andares = new ArrayList<>();
        for(int i = 1; i <= 1028; i++){
            if(!String.valueOf(i).contains("4") && !String.valueOf(i).contains("13")){
                andares.add(i);
            }
        }
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Informe o numero desejado: ");
            Integer numero = input.nextInt();
            System.out.println("Andar equivalente: " + andares.get(numero-1));
        }while (true);

    
}

}
