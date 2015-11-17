package ammunition;

public abstract class Ammunition {

    private double cost;
    private double weight;

    public Ammunition(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ammunition cost: " + cost + " weight: " + weight;
    }
}
