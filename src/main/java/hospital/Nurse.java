package hospital;

public class Nurse extends Employee implements MedicalDuties {

	public Nurse(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}

	@Override
	public int getSalary() {
		return 50000;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hospital.MedicalDuties#drawBlood(hospital.Bleedable)
	 */
	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hospital.MedicalDuties#administerCare(hospital.Patient)
	 */
	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(5);
	}

}
