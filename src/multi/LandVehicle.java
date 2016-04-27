package multi;

public class LandVehicle extends Vehicle implements ILandVehicle {
    private int mileage;

    public LandVehicle(String name, int mileage) {
        super(name);
        setMileage(mileage);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void addMileage(int delta) {
        this.mileage += delta;
    }

    public String toString() {
        return getName() + " ma przebieg " + getMileage() + " km";
    }
}
