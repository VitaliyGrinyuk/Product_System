package material;

public class Cotton extends Material {
	
	public Cotton(int amount) {
		super(amount);
	}

	public double getCost() {
		return 5;
	}

	public int getAmount() {
		return amount;
	}

}
