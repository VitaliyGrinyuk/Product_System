package product;

public enum Size {
	
	XS(0.8), 
	S(0.9), 
	M(1), 
	L(1.1), 
	XL(1.2), 
	XXL(1.3), 
	XXXL(1.4);

	private double factor;
	
	private Size(double factor) {
		this.setFactor(factor);
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}
}