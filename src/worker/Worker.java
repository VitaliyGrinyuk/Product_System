package worker;

public abstract class Worker {
	
	protected double rate;
	protected String name;
	protected double scoredHours;
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScoredHours() {
		return scoredHours;
	}
	public void setScoredHours(double scoredHours) {
		this.scoredHours = scoredHours;
	}

}
