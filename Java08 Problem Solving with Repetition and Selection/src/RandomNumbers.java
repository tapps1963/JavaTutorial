import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random generator = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(generator.nextInt(10));
		}

		int die1 = 0, die2 = 0, die3 = 0, die4 = 0, die5 = 0, die6 = 0;

		for (int i = 0; i < 1000; i++) {
			int die = generator.nextInt(6) + 1;

			switch (die) {
			case 1:
				die1++;
				break;
			case 2:
				die2++;
				break;
			case 3:
				die3++;
				break;
			case 4:
				die4++;
				break;
			case 5:
				die5++;
				break;
			case 6:
				die6++;
				break;
			}
		}
		// Show the result
		System.out.println("No 1 fell " + die1 + " times.");
		System.out.println("No 2 fell " + die2 + " times.");
		System.out.println("No 3 fell " + die3 + " times.");
		System.out.println("No 4 fell " + die4 + " times.");
		System.out.println("No 5 fell " + die5 + " times.");
		System.out.println("No 6 fell " + die6 + " times.");
	}
}
