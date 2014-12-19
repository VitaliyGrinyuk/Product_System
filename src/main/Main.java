package main;

import product.*;

public class Main {
	
	static int margin = 30;
	
	public static void main(String[] args) {
		
		/** initialize Manager */
		Manager manager = Manager.getInstance();
		
		/** start test */
		produceAndSell(manager, new Blouse(Size.XS), 5);
		produceAndSell(manager, new Jacket(Size.XXXL), 2);
		produceAndSell(manager, new Socks(), 30);
		produceAndSell(manager, new Blouse(Size.M), 1);
		produceAndSell(manager, new Socks(), 20);
		produceAndSell(manager, new Coat(Size.S), 8);
		produceAndSell(manager, new Coat(Size.XXXL), 2);

		
		/** can produce some products and not selling them immediately*/
		Product[] arr = {new Socks(), new Coat(Size.M), new Jacket(Size.S)};
		for (Product product : arr) {
			manager.produce(product);
		}
		
		/** get all products that are in the warehouses */
		//ArrayList<Product> stockpile = manager.getStockpile();
		
//		for (Product product : stockpile) {
//			manager.sell(product, manager.addMargin(product, margin));
//		}
		
		/** calculate profit */
		manager.printProfit();
		
		
	}

	/**
	 * just for test
	 * @param manager - manager responsible for the process
	 * @param product - product which is necessary to produce and sell
	 * @param numberOfUnits - number of products
	 */
	private static void produceAndSell(Manager manager, Product product, int numberOfUnits) {
		
		for (int i = 1; i < numberOfUnits; i++) {
			
			/** produce new product */
			manager.produce(product);
			/** sell the product for a specified price */
			manager.sell(product, manager.addMargin(product, margin));
		}
		
	}

}
