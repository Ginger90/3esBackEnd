package Es3;

import java.util.Scanner;

public class while_ {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci una stringa (per interrompere scrivi :q): ");
            String input = scanner.nextLine();
            if (input.equals(":q")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i < input.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}


