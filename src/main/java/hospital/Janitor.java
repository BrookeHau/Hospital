package hospital;

public class Janitor extends Employee {

	private boolean isSweeping;
	
	public Janitor(String empNumber, String empName, boolean isSweeping) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}
	
	@Override 
	public int getSalary(){
		return 40000;
	}
}
