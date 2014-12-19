package main;

public interface Producible {
	
	void setProduced(boolean flag);
	
	boolean isProduced();

	double getCostOfMaterials();
	
	double getCostOfWork();

	int getVolume();

	double getProductionTime();

	void setCostOfWork(double d);
}
