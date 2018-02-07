package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	private MedicalDuties underTest = new Nurse("1234", "Jackie");
	private Nurse nurseTest = new Nurse("1234", "Jackie");
	private Patient patient = new Patient();

	@Test
	public void shouldHaveSalaries() {
		Employee underTest = new Nurse("", "");
		int salary = underTest.getSalary();

		assertThat(salary, is(50000));
	}

	@Test
	public void shouldBeAbleToDrawBlood() {
		MedicalDuties underTest = new Nurse("", "");
		int bloodBefore = patient.getBloods();
		underTest.drawBlood(patient);
		int bloodAfter = patient.getBloods();
		assertThat(bloodBefore - bloodAfter, is(1));

	}

	@Test
	public void IncreasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter - healthBefore, is(5));
	}
	
	@Test
	public void shouldReturnNumber(){
		String check = nurseTest.getEmpNumber();
		assertEquals(check, "1234");
	}
	
	@Test
	public void shouldReturnEmpName(){
		String check = nurseTest.getEmpName();
		assertEquals(check,"Jackie");
	}

}
