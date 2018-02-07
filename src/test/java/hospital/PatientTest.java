package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {

	private Employee underTest = new Doctor("", "", "");
	private Patient patient = new Patient();

	@Test
	public void patientTest() {
		patient.removeBlood(3);
		int currentBlood = patient.getBloods();

		assertThat(currentBlood, is(39));

	}
	
	@Test
	public void shouldBeAbleToAddHealth(){
		Patient patient = new Patient();
		
		patient.giveHealth(10);
		int currentHealth = patient.getHealth();
		assertThat(currentHealth, is(20));
//		assertThat(patient.DEFAULT_Health + 10, is(currentHealth));
	}
}
