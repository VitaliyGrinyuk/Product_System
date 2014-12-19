package main;

import warehouse.Warehouse;

public interface Storeable {
	
	int getVolume();
	
	Warehouse getWarehouse();

	void setWarehouse(Warehouse warehouse);
}
