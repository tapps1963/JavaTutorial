
public class StaticDemo {

	public static void main(String[] args) {
		int maxSpeed = RaceCar.getMaxSpeedForAll();
		int raceLength = 1000;

		RaceCar andretti = new RaceCar(60, "Andretti");

		andretti.setSpeed(100);

		//andretti.getMaxSpeedForAll(); should be using the name of the class

		while (andretti.getLocation() < raceLength) {

			System.out.println(andretti + " is in the first place!!!");
		}

	}

}
