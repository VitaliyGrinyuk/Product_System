package main;

import java.util.ArrayList;

import product.*;
import warehouse.*;

public class Manager {
	
	private static Manager instance = new Manager();
	
	public static Manager getInstance() {
		return instance;
	}

	private Manager() {}

	private WarehouseManager warehouseManager = WarehouseManager.getInstance();
	private ProductManager productManager = ProductManager.getInstance();
	
	private ArrayList<Product> soldItems = new ArrayList<Product>();

	public Product produce(Product product) {

		boolean productAdded = warehouseManager.addProductToWarehouse(product);

		if (!productAdded) {
			System.err
					.println("The production of this product is not possible, since there is insufficient space on warehouses");
		} else {
			productManager.sendProductToWorker(product);
			System.out.println("The production cost of " + product.getTitle() + " is -> "
					+ (product.getCostOfMaterials() + product.getCostOfWork()));
		}
		product.setProduced(productAdded);

		return product;
	}

	public void sell(Product product, double price) {
		if (product.isProduced()) {
			warehouseManager.removeProductFromWarehouse(product);
			product.setSellingPrice(price);
			getSoldItems().add(product);
			System.out.println(product.getTitle() +  " was sold for -> " + price);
		} else {
			System.err.println("The product must be produced before selling");
		}
	}

	public ArrayList<Product> getSoldItems() {
		return soldItems;
	}

	public void printProfit() {
		double profit = 0;
		for (Product product : soldItems) {
			profit += product.getSellingPrice() - product.getProductionCost();
		}
		System.out.println("Profit -> " + profit);
	}

	public double addMargin(Product product, double margin) {
		double cost = product.getProductionCost();
		cost = cost + cost / 100 * margin;
		return Math.round(cost);
	}

	public ArrayList<Storeable> getStockpile() {
		return warehouseManager.getStockpile();
	}

}
