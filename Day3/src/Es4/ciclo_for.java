package Es4;

import java.util.Scanner;

public class ciclo_for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		
		 int num = input.nextInt();
		 for (int i = num -1; i >= 0; --i) { 
	 System.out.println( i );
	}
		 input.close();
}
}