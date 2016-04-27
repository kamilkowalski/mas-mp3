package overlapping;

public class ElectricityHeatedBuilding extends HeatedBuilding {
    private static final double COST_PER_CUBIC_METER = 1.5;

    public ElectricityHeatedBuilding(Building building) throws Exception {
        super(building);
    }

    public double estimateHeatingCosts() {
        return getHeatingVolume() * COST_PER_CUBIC_METER;
    }
}
