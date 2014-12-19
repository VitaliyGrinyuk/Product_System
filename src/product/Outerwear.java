package product;

public abstract class Outerwear extends Product {
	
	protected Size size;
	
	protected Outerwear() {
	}
	
	public Outerwear(Size size) {
		this.setSize(size);
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
