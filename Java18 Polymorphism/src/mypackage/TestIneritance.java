package mypackage;

public class TestIneritance {

	public static void main(String[] args) {

		Animal myPet = new Animal(12);

		System.out.println(myPet);

		Dog max = new Dog(34, "Max");
		Dog rover = new Dog(34,"Rover");
		
		if (max.equals(rover)) {
			System.out.println("Max and Rover are equal");
		} else {
			System.out.println("Max and Rover are NOT equal");			
		}
		
		max.setName("Maxwell");
		max.setWeight(56);
		System.out.println(max);

		Cat fluffy = new Cat(12, "Fluffy", true);
		System.out.println(fluffy);
		
		Animal pet;
		pet = fluffy;
		System.out.println(pet);
		pet = max;
		System.out.println(pet);
		
		foo(max);
		foo(fluffy);
		foo(myPet);
	}

	public static void foo(Animal animal) {
		if (animal instanceof Cat) {
			System.out.println("In foo: I'm a Cat");
		}
		
		if (animal instanceof Dog) {
			System.out.println("In foo: I'm a Dog");
		}
		
		if (animal instanceof Animal) {
			System.out.println("In foo: I'm an Animal");
		}
		System.out.println("In foo: " + animal.toString());
	}
}