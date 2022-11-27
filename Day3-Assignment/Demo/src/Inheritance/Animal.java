package Inheritance;

public class Animal {

	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	public Animal(boolean vegetarian, String food, int noOfLegs) {
		super();
		this.vegetarian = vegetarian;
		this.eats = food;
		this.noOfLegs = noOfLegs;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getEats() {
		return eats;
	}
	public void setEats(String eats) {
		this.eats = eats;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	
}
