package overlapping;

public abstract class HeatedBuilding {
    private Building building;

    private static final double averageHeight = 2.5;

    public HeatedBuilding(Building building) throws Exception{
        setBuilding(building);
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) throws Exception {
        if (this.building == building) return;

        if (this.building != null) {
            this.building.removeHeatedBuilding(this);
        }

        this.building = building;
        this.building.addHeatedBuilding(this);
    }

    public double getHeatingVolume() {
        return getBuilding().getArea() * averageHeight;
    }

    public abstract double estimateHeatingCosts();
}
