
public class Computer {
	private OperatingSystem os = new OperatingSystem();
	private PowerSupply ps = new PowerSupply();
	
	void turnOnComputer(){
		ps.turnOn();
		os.bootUp();
	}
	
	void turnOffComputer() {
		os.shutDown();
		ps.turnOff();
	}

}
