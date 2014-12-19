package product;

import material.*;

public class Socks extends Product {
	
	protected Material[] composition = {new Cotton(3), new Acrylic(1)};
	
	public Socks() {
		this.setTitle("Socks");
		this.setProductionTime(0.25);
		this.setVolume(1);
		for (Material material : composition) {
			setCostOfMaterials(getCostOfMaterials() + material.getAmount() * material.getCost());
		}
	}

}
