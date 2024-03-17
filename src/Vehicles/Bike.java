package Vehicles;

public class Bike extends Engine{
	private String type; 

    public Bike(String type, int horsePowerCC) {
        super(type, horsePowerCC); 
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
