package mypackage;

public class TestingInterfaces {

	public static void main(String[] args) {

		Animal pet = new Animal(24);

		pet.makeNoise();

		Noisy thing;

		thing = pet;
		doStuff(pet);

		Dog max = new Dog(56, "Max");
		Dog rover = new Dog(76, "Rover");

		System.out.println(max.compareTo(rover));
		System.out.println(rover.compareTo(max));
		
		if(better(max, rover)) {
			System.out.println("My dog is better");
			
		}
		better("hello","bob");
	}
	
	public static void sort(Comparable[] myComparableObject) {
		
		
	}

	public static boolean better(Comparable obj1, Comparable obj2) {
		if(obj1.compareTo(obj2) >0) {
			return true;
		} else {
			return false;
		}
	}

	public static void doStuff(Noisy n) {

		n.makeNoise();

	}

}
