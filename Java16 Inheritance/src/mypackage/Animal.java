package mypackage;

public class Animal extends Object{

	private int weight;

	public Animal(int weight) {
		super();
		setWeight(weight);
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
