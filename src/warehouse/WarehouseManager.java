package warehouse;

import java.util.ArrayList;
import main.Storeable;

public class WarehouseManager {
	
	private static WarehouseManager instance = new WarehouseManager();
	
	public static WarehouseManager getInstance() {
		return instance;
	}

	private WarehouseManager() {}

	Warehouse[] warehouse = { new Warehouse1(400), new Warehouse2(800) };
	ArrayList<Storeable> stockpile = new ArrayList<>();

	public boolean addProductToWarehouse(Storeable item) {
		for (int i = 0; i < warehouse.length; i++) {
			if (warehouse[i].getCapacity() > item.getVolume()) {
				warehouse[i].addProduct(item);
				return true;
			}
		}
		return false;
	}

	public void removeProductFromWarehouse(Storeable product) {
		Warehouse warehouse = product.getWarehouse();
		if (warehouse != null) {
			warehouse.removeProduct(product);
		}
	}

	public ArrayList<Storeable> getStockpile() {
		for (Warehouse w : warehouse) {
			boolean empty = w.getInStock().isEmpty();
			if (!empty) {
				for (int i = 0; i < w.getInStock().size(); i++) {
					stockpile.add(w.getInStock().get(i));
				}
			}
		}
		return stockpile;

	}
}