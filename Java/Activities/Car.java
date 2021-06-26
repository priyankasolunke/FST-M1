package activities;

public class Car {
	String Colour;
	String transmission;
	int make, tyres, doors;
	Car(){
	tyres =4;
	doors = 4;
	}

	public void displaycharacteristics() {
		System.out.println("Color of the Car: " + Colour);
		System.out.println("Make : " + make);
		System.out.println("Transmission : " + transmission);
		System.out.println("Number of doors: " + doors);
	    	System.out.println("Number of tyres : " + tyres);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}

}
