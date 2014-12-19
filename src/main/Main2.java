package main;

import product.*;

public class Main2 {
	
	public static void main(String[] args) {
		
		/** initialize Manager */
		Manager manager = Manager.getInstance();
		
		/** produce new product */
		Product product = manager.produce(new Blouse(Size.XXL));
		Product product2 = manager.produce(new Socks());
		
		/** sell the product for a specified price */
		manager.sell(product, manager.addMargin(product, 25));
		manager.sell(product2, manager.addMargin(product2, 25));
		
		
	}
}
