package Es2;

import java.util.Scanner;

public class switch_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int num = input.nextInt();
		switch (num) {
		case 0:
		System.out.println("zero");
		break;
		case 1:
		System.out.println("One");
		break;
		case 2:
		System.out.println("Twoo");
		break;
		case 3:
		System.out.println("Three");
		break;
		default:
			System.out.println("error");
		}
		input.close();
	}

}

