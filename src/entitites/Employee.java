package entitites;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public double payment() {
		return hours * valuePerHour;

	}
	
	public String toString() {
		return name
				+ " - "
				+ "$ "
				+ payment();
	}
}
