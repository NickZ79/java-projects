import java.util.ArrayList;

public class Pizza {

    private final ArrayList<Ingredient> ingredients;
    private final boolean deliveryYn;
    private double totalCost;

    public Pizza(ArrayList<Ingredient> ingredients, boolean deliveryYn) {
        this.ingredients = ingredients;
        this.deliveryYn = deliveryYn;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean isDeliveryYn() {
        return deliveryYn;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
