package material;

public class Tricot extends Material {
	
	public Tricot(int amount) {
		super(amount);
	}

	public double getCost() {
		return 30;
	}

	public int getAmount() {
		return amount;
	}

}
