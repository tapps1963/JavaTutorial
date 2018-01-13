
/**
 * DemoOOPmethodsTerminology
 * 
 * Version 1
 * 
 * @author shayne date
 * 
 *
 */

public class DemoOOPmethodsTerminology {

	public static void main(String[] args) {

		System.out.println("Hello!");

		double variable;

		variable = Math.sqrt(100.0) + 45.6;
		
		//TODO Check out

		System.out.println("the squareroot of 100 + 45.6 is " + variable);
		double powerTo3 = Math.pow(2.0, 3.0);

		System.out.println("2 to the 3rd power " + powerTo3);
		System.out.println("10 to the power of 32 " + Math.pow(10.0, 32.0));
		System.out.println("Value of PI is " + Math.PI);

		String name = new String("Bapsfontein");

		int stringLength = name.length();
		System.out.println(name + " " + stringLength);

		char myChar = name.charAt(2);

		System.out.println(myChar);

	}

}
