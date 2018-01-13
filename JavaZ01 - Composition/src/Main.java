
public class Main {
	
	public static void main(String[] args) {
		Human bob = new Human("bob");
		Dog tom = new Dog("tom",bob);
		
		System.out.println(tom);
	}

}
