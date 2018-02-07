package hospital;

public class Receptionist extends Employee {

	private boolean isOnPhone;

	public Receptionist(String empNumber, String empName, boolean isOnPhone) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isOnPhone = isOnPhone;
	}

	@Override
	public int getSalary() {
		return 45000;
	}

	



}
