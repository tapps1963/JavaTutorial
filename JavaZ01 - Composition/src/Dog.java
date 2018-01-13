
public class Dog {
	
	private String name;
	// Dog belongs to human
	private Human owner;
	
	public Dog(String name, Human owner) {
		this.name = name;
		this.owner = owner;
		
	}
	
	public String toString() {
		
		return String.format("My name is: %s , my owner's name %s", name, owner);
	}

}
