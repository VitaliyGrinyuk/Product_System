package product;

import warehouse.*;
import main.Producible;
import main.Storeable;
import material.*;

public abstract class Product implements Producible, Storeable{
	
//	protected String title;
//	protected int volume;
//	protected Material[] composition;
//	protected double costOfMaterials;
//	protected double costOfWork;
//
//	protected double productionTime;
	protected boolean produced;
	protected Warehouse warehouse;
	protected boolean sold;
	protected double sellingPrice;
	
	public Product() {
	}
	
	public abstract Material[] getComposition();
	
	public abstract String getTitle();
	
	//public abstract double getProductionTime();
	
	public abstract int getVolume();

	protected double applySizeFactor(double result, Size size) {
		return result = size.getFactor() * result;
		
	}

	public double getProductionCost() {
		return (this.getCostOfMaterials() + this.getCostOfWork());
	}

	public double getCostOfMaterials() {
		Material[] composition = this.getComposition();
		double costOfMaterials = 0;
		for (Material material : composition) {
			costOfMaterials += material.getAmount() * material.getCost();
		}
		return costOfMaterials;
	}


	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse; 
	}

	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
		this.setSold(true);
	}

	public boolean isSold() {
		return sold;
	}

	protected void setSold(boolean sold) {
		this.sold = sold;
	}

	public boolean isProduced() {
		return produced;
	}

	public void setProduced(boolean produced) {
		this.produced = produced;
	}
	

	@Override
	public double getCostOfWork() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCostOfWork(double d) {
		// TODO Auto-generated method stub
		
	}

}
