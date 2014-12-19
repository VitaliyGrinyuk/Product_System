package material;

public class Fur extends Material {
	
	public Fur(int amount) {
		super(amount);
	}

	public double getCost() {
		return 20;
	}

	public int getAmount() {
		return amount;
	}

}
