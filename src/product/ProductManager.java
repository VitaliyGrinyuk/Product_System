package product;

import main.Producible;
import worker.*;

public class ProductManager {
	
	private static ProductManager instance = new ProductManager();
	
	public static ProductManager getInstance() {
		return instance;
	}

	private ProductManager() {}
	
	Worker[] workers = { new Worker1(12), new Worker2(8), new Worker3(6), new Worker4(14) };

	public void sendProductToWorker(Producible product) {
		Worker freeWorker = workers[0];
		for (int i = 1; i < workers.length; i++) {
			if (workers[i].getScoredHours() < freeWorker.getScoredHours()) {
				freeWorker = workers[i];
			}
		}
		if (freeWorker != null) {
		freeWorker.setScoredHours(freeWorker.getScoredHours() + product.getProductionTime());
		product.setCostOfWork(freeWorker.getRate() * product.getProductionTime());
		}
	}

}
