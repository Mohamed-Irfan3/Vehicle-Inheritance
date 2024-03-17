package Vehicles;

public class Engine {
	private String type; 
    private int horsePowerCC;

    public Engine(String type, int horsePowerCC) {
        this.type = type;
        this.horsePowerCC = horsePowerCC;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePowerCC;
    }

    public void setHorsePower(int horsePowerCC) {
        this.horsePowerCC = horsePowerCC;
    }





}
