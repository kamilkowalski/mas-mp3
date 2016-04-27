package polymorphism;

public class RuralNeighbourhood extends Neighbourhood {
    public RuralNeighbourhood(String name, int population) {
        super(name, population);
    }

    public int getPopulation() {
        return population;
    }
}
