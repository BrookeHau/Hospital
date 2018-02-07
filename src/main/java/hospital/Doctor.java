package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialtyArea;

	public Doctor(String empNumber, String empName, String specialtyArea) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialtyArea= specialtyArea;
	}


	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}
	
	@Override
	public int getSalary() {
		return 90000;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(10);
	
	}
}
