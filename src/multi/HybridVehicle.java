package multi;

public class HybridVehicle extends WaterVehicle implements ILandVehicle {
    private LandVehicle landVehicle;

    public HybridVehicle(String name, int mileage, WaterVehicleType type) {
        super(name, type);
        landVehicle = new LandVehicle(name, mileage);
    }

    public int getMileage() {
        return landVehicle.getMileage();
    }

    public void setMileage(int mileage) {
        landVehicle.setMileage(mileage);
    }

    public void addMileage(int delta) {
        landVehicle.addMileage(delta);
    }

    public String toString() {
        return getName() + " nie tylko jeździ, ale i pływa:\n" + super.toString() + "\n" + landVehicle.toString();
    }
}
