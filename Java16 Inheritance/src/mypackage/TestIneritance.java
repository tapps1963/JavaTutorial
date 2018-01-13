package mypackage;

public class TestIneritance {

	public static void main(String[] args) {

		Animal myPet = new Animal(12);

		System.out.println(myPet);

		Dog max = new Dog(34, "Max");
		
		max.setName("Maxwell");
		max.setWeight(56);
		
		System.out.println(max);

	}

}