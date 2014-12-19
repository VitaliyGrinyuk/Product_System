package product;

import material.*;

public class Jacket extends Outerwear {

protected Material[] composition = {new Leather(30), new Tricot(10), new Accessories(2)};
	
	public Jacket() {
		this.setTitle("Jacket");
		this.setProductionTime(2);
		this.setVolume(5);
		for (Material material : composition) {
			setCostOfMaterials(getCostOfMaterials() + material.getAmount() * material.getCost());
		}
	}
	
	public Jacket(Size size) {
		this();
		this.setSize(size);
		setCostOfMaterials(this.applySizeFactor(getCostOfMaterials(), size));
	}

	
}
