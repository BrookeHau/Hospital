package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	private Doctor underTest = new Surgeon(null, null,null, false);
	private Surgeon surgeon = new Surgeon(null, null,null, true);
	private Patient patient = new Patient();

	@Test
	public void shouldReturnSalary() {
		Doctor underTest = new Surgeon(null, null,null, false);
		int check = underTest.getSalary();
		assertThat(check, is(120000));

	}

	@Test
	public void shouldAdministerCare() {
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter-healthBefore, is(20));

	}
	
	@Test
	public void shouldDrawBlood(){
		
		int bloodBefore = patient.getBloods();
		underTest.drawBlood(patient);
		int bloodAfter = patient.getBloods();
		
		assertThat(bloodBefore - bloodAfter, is(1));
	}
	
	//initiate surgery based on low health and blood levels
	@Test
	public void shouldOperate(){
		
		surgeon.operate(patient);
		assertThat(surgeon.isOperating(), is(true));
	}
	
}
