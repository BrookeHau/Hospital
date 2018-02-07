package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor phil = new Doctor("1111", "Phil", "Brain");
		Surgeon harry = new Surgeon("2222","Harry","Heart", true);
		Nurse jackie = new Nurse("3333","Jackie");
		Janitor rosie = new Janitor("4444", "Rosie", true);
		Receptionist janine = new Receptionist("5555", "Janine", true);
		
		Hospital hospital = new Hospital();
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(rosie);
		hospital.addEmployee(janine);
		
		System.out.println("Here are the pay rates: ");
		hospital.showPayRates();
		
		hospital.showAllMedicalPersonnel();
	}

}
