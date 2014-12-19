package product;

import material.*;

public class Blouse extends Outerwear {
	
	@Override
	public String getTitle() {
		return "Blouse";
	}
	
	@Override
	public Material[] getComposition() {
		Material[] composition = { 
				new Tricot(10), 
				new Cotton(5),
				new Accessories(2), 
				new Polyester(5) 
				};
		return composition;
	}
	
	@Override
	public int getVolume() {
		return 5;
	}
	
	@Override
	public double getProductionTime() {
		return 2;
	}

}
