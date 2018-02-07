package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void shouldBeAbleToAddEmployee(){
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("", "","");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, contains(doctor));
	}
	
	@Test
	public void shouldbeAbleToAddMultipleEmployees(){
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("","","");
		Nurse nurse = new Nurse("", "");
		Receptionist recept = new Receptionist("", "", true);
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, containsInAnyOrder(recept));
	}
}
