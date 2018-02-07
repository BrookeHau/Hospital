package hospital;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class DoctorTest {

	private Doctor underTest = new Doctor("1111", "Phil", "");
	private Patient patient = new Patient();

	@Test
	public void shouldDrawBlood() {
		int bloodBefore = patient.getBloods();
		underTest.drawBlood(patient);
		int bloodAfter = patient.getBloods();

		assertThat(bloodBefore - bloodAfter, is(1));

	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBloodFromDouble() {
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveSalaries() {
		Employee underTest = new Doctor("1111", "Phil", "");
		int salary = underTest.getSalary();

		assertThat(salary, is(90000));
	}

	@Test
	public void shouldIncreasePatientHealth() {
		// Doctor underTest = new Doctor();
		// Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter - healthBefore, is(10));

	}

	@Test
	public void shouldReturnEmpNumber(){
		String check = underTest.getEmpNumber();
		assertEquals(check,"1111");
	}
	
	@Test
	public void shouldReturnEmpName(){
		String check = underTest.getEmpName();
		assertEquals(check,"Phil");
	}

}
