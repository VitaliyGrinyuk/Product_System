package warehouse;

import java.util.ArrayList;

import main.Storeable;

public abstract class Warehouse {

	protected int capacity;
	protected String name;
	public ArrayList<Storeable> inStock = new ArrayList<Storeable>();

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addProduct(Storeable item) {

		if (getInStock().add(item)) {
			this.setCapacity(this.getCapacity() - item.getVolume());
			item.setWarehouse(this);
			//System.out.println("the product was added to " + this.getName());
		}

	}

	public void removeProduct(Storeable item) {

		if (getInStock().remove(item)) {
			this.setCapacity(this.getCapacity() + item.getVolume());
			item.setWarehouse(null);
			//System.out.println("the product was removed from " + this.getName());
		}

	}

	public ArrayList<Storeable> getInStock() {
		return inStock;
	}

}
