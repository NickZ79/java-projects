import java.util.ArrayList;

public class PizzaMaker {

    public Pizza makePizza(ArrayList<Ingredient> ingredients, boolean deliverYn) {
        Pizza pizza = new Pizza(ingredients, deliverYn);

        double total = 5.00; // base cheese pizza
        for (Ingredient ing : ingredients) {
            String type = ing.getClass().getSimpleName();

            if (type.equals("Ham") || type.equals("Pepperoni")) {
                total = total + 2.00;
            } else if (type.equals("Mushroom") || type.equals("GreenPepper")) {
                total = total + 1.00;
            } else {
                total = total + 0.00;
            }
        }

        if (deliverYn) {
            total = total + 3.00;
        }

        pizza.setTotalCost(total);
        return pizza;
    }
}
