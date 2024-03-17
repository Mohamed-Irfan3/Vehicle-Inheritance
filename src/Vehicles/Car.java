package Vehicles;

public class Car extends Engine{
	private String model;
    private int numDoors;

    public Car(String type, int horsePowerCC, String model, int numDoors) {
        super(type, horsePowerCC); 
        this.model = model;
        this.numDoors = numDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }




}
