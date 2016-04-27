package multi;

public class WaterVehicle extends Vehicle {
    public enum WaterVehicleType { SAILBOAT, MOTORBOAT };

    private WaterVehicleType type;

    public WaterVehicle(String name, WaterVehicleType type) {
        super(name);
        setType(type);
    }

    public WaterVehicleType getType() {
        return type;
    }

    public void setType(WaterVehicleType type) {
        this.type = type;
    }

    public String toString() {
        switch(type) {
            case SAILBOAT:
                return getName() + " to żaglówka";
            case MOTORBOAT:
                return getName() + " to motorówka";
            default:
                return getName() + " to nie wiadomo co, ale pływa";
        }
    }
}
