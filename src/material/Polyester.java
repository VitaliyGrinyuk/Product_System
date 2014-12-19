package material;

public class Polyester extends Material {
	
	public Polyester(int amount) {
		super(amount);
	}

	public double getCost() {
		return 15;
	}

	public int getAmount() {
		return amount;
	}

}
