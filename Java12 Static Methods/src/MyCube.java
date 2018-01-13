
public class MyCube {

	public static void main(String[] args) {
		int cubeOfSeven;
		int seven = 7;

		cubeOfSeven = cube(seven); // method call (invocation)
		outputMessage();
		System.out.println(cubeOfSeven);

		int[] array = { 12, 23, 34, 56 };
		double average = findAverage(array);

		System.out.println("The average is " + average);
	}

	private static double findAverage(int[] listToAverage) {
		double result;
		double sum = 0;

		for (int i = 0; i < listToAverage.length; i++) {
			sum += listToAverage[i];
		}
		result = sum / listToAverage.length;
		return result;
	}

	public static void outputMessage() {
		System.out.println("Hello");
	}

	public static int cube(int parameter) {
		int result;
		result = parameter * parameter * parameter;
		return result;
	}
}
