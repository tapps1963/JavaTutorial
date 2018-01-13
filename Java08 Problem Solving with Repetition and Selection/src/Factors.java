import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int number;

		System.out.print("Enter an integer: ");
		number = keyboard.nextInt();

		for (int factor = 1; factor <= number; factor++) {
			if (number % factor == 0) {
				System.out.println(factor);
			}
		}
	}
}
