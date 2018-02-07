package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_BLOODS = 42;
	private int bloodUnit = DEFAULT_BLOODS;
	private int DEFAULT_Health = 10;
	private int health = DEFAULT_Health;

	public int getBloods() {
		return bloodUnit;
	}

	public void removeBlood(int amountDrawn) {
		bloodUnit -= amountDrawn;
	}

	public int getHealth() {
		return health;
	}

	public void giveHealth(int amount) {
		health += amount;
	}

}
