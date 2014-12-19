package material;

public abstract class Material {

	protected int amount;
	
	public Material(int amount) {
		this.setAmount(amount);
	}

	public abstract double getCost();
	
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
