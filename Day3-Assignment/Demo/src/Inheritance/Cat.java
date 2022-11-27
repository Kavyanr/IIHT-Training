package Inheritance;

public class Cat extends Animal {

	private String color="brown";
	public Cat(boolean vegetarian, String food, int noOfLegs) {
		super(vegetarian, food, noOfLegs);
		this.color="white";
	}
	public Cat(boolean vegetarian, String food, int noOfLegs, String color) {
		super(vegetarian, food, noOfLegs);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
