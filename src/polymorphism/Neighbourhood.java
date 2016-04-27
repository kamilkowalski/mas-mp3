package polymorphism;

public abstract class Neighbourhood {
    private String name;
    protected int population;

    public Neighbourhood(String name, int population) {
        setName(name);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public abstract int getPopulation();

    public String toString() {
        return "Osiedle " + getName() + ", populacja: " + getPopulation();
    }
}
