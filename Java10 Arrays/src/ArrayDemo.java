import java.lang.module.FindException;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] grades;
		int size = 13;

		grades = new int[size];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = 100;
		}

		double[] data = new double[100];

		for (int i = 0; i < data.length; i++) {
			data[i] = Math.random();
		}

		for (double d : data) {
			System.out.println(d);
		}

		double result;
		result = findAverage(data);

		System.out.println("The average is: " + result);

		String[] names;

		names = new String[4];
		names[0] = "Bob";
		names[1] = "Colin";
		names[2] = "Jay";
		names[3] = "Wayne";

		for (String name : names) {
			System.out.println(name);
		}

	} // end main

	static double findAverage(double[] theArray) {
		double average = 0.0, sum = 0.0;
		for (int i = 0; i < theArray.length; i++) {
			sum += theArray[i];
		}
		average = sum / theArray.length;
		return average;
	}
}
