package polymorphism;

public class UrbanNeighbourhood extends Neighbourhood {
    private float foreignersFactor;

    public UrbanNeighbourhood(String name, int population, float foreignersFactor) throws Exception {
        super(name, population);
        setForeignersFactor(foreignersFactor);
    }

    public float getForeignersFactor() {
        return foreignersFactor;
    }

    public void setForeignersFactor(float foreignersFactor) throws Exception{
        if (foreignersFactor > 1.0 || foreignersFactor < 0) {
            throw new Exception("Foreigners factor must be between 0 and 1");
        }
        this.foreignersFactor = foreignersFactor;
    }

    public int getPopulation() {
        return Math.round(population * (1.0f - foreignersFactor));
    }
}
