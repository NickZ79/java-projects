public abstract class Ingredient {
    private double cost;

    public Ingredient(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
