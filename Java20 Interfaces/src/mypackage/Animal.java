package mypackage;

public class Animal implements Noisy{

	private int weight;

	public Animal(int weight) {
		setWeight(weight);
	}
	
	//abstract public void makeNoice(); // abstract means to take out the detail
	
	
	public void makeNoise() {
		System.out.println("I dont make any noise");
	}
	

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		String result;
		result = " I'm an animal weighing: " + weight;
		return result;
	}
}
