package Polymorphism;



public class SampleApp {

	public static void main(String[] args) {
		Shape myShape = new Shape();  // Create a Shapes object
	    Shape myTriangle = new Triangle();  // Create a Triangle object
	    Shape myCircle = new Circle();  // Create a Circle object
	    myShape.area();
	    myTriangle.area();
	    myShape.area();
	    myCircle.area();

	}

}
