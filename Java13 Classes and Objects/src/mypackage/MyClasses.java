package mypackage;

public class MyClasses {

	public static void main(String[] args) {
		// Date birthday = new Date(); // Constructor method Java default
		Date birthday = new Date(11, 16, 1963);

		birthday.setMonth(11);

		//System.out.println(birthday.toString()); // The explicit way
		System.out.println(birthday); // The quicker way
		//
	}
}
