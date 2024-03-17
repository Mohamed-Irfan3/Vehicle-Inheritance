package Vehicles;

public class Main {
	public static void main(String[] args) {
        Car myCar = new Car("Diesel", 1500, "Toyota Innova", 5);
        Bike myBike = new Bike("Petrol", 500);

        System.out.println("Car Details:");
        System.out.println("Engine Type: " + myCar.getType()); 
        System.out.println("HorsepowerCC: " + myCar.getHorsePower()); 
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Number of Doors: " + myCar.getNumDoors());
        
        System.out.println("\nBike Details:");
        System.out.println("Engine Type: " + myBike.getType());
        System.out.println("HorsepowerCC: " + myBike.getHorsePower()); 
        System.out.println("Type: " + myBike.getType()); 
	}


}
