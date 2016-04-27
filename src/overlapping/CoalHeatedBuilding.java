package overlapping;

public class CoalHeatedBuilding extends HeatedBuilding {
    private static final double COST_PER_CUBIC_METER = 1.5;
    private static final double TRANSPORT_COST = 3000;

    public CoalHeatedBuilding(Building building) throws Exception {
        super(building);
    }

    public double estimateHeatingCosts() {
        return getHeatingVolume() * COST_PER_CUBIC_METER + TRANSPORT_COST;
    }
}
