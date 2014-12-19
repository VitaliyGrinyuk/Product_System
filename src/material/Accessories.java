package material;

public class Accessories extends Material {
	
	public Accessories(int amount) {
		super(amount);
	}

	public double getCost() {
		return 5;
	}

	public int getAmount() {
		return amount;
	}

}
