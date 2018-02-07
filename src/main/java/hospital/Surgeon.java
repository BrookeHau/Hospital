package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String empName, String specialtyArea, boolean isOperating) {
		super(empNumber, empName, specialtyArea);
		this.setOperating(isOperating);
	}

	@Override
	public int getSalary() {
		return 120000;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(20);
	
	}

	public void operate(Patient patient) {
		if(patient.getHealth() <= 10){
			setOperating(true);
		} else{
			setOperating(false); 
		}
		
	}

	public boolean isOperating() {
		return isOperating;
	}

	public void setOperating(boolean isOperating) {
		this.isOperating = isOperating;
	}
	
	
	

}
