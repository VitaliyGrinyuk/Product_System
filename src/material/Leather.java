package material;

public class Leather extends Material {
	
	public Leather(int amount) {
		super(amount);
	}

	public double getCost() {
		return 30;
	}

	public int getAmount() {
		return amount;
	}

}
