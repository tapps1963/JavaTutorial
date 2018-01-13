
public class Date { // Name of the Class is a noun - a thing

	private int month; // Instance variables are private
	private int day;
	private int year;

	// Constructor Method
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	// Getter and Setters
	public int getMonth() { // accessor (getters)
		return month;
	}

	public void setMonth(int m) { // mutator (setter)
		if (m >= 1 && m <= 12) {
			month = m;
		}
	}

	public int getDay() { // accessor (getters)
		return day;
	}

	public void setDay(int d) { // mutator (setter)
		day = d;
	}

	public int getYear() { // accessor (getters)
		return year;
	}

	public void setYear(int y) { // mutator (setter)
		year = y;
	}

	// toString
	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}

}
