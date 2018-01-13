
public class Composition {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.turnOnComputer();
		
		System.out.println("\nBrowsing the internet...");
		System.out.println("Writing some source code...");
		System.out.println("Saving work...\n");
		
		c.turnOffComputer();
		
		c = null; 
		
	}

}
