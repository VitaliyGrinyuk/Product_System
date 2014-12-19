package product;

import material.*;

public class Coat extends Outerwear {

	public Material[] getComposition() {
		Material[] composition = {new Tricot(10), new Cotton(20), new Accessories(5)};
		return composition;
	}
	
	public String getTitle(){
		return "Coat";
	}
	
	public int ProductionTime(){
		return 2;
	}
	
	public int getVolume(){
		return 5;
	}
	
//	public Coat() {
//		for (Material material : composition) {
//			setCostOfMaterials(getCostOfMaterials() + material.getAmount() * material.getCost());
//		}
//	}
//	
//	public Coat(Size size) {
//		this();
//		this.setSize(size);
//		setCostOfMaterials(this.applySizeFactor(getCostOfMaterials(), size));
//	}
	
}
