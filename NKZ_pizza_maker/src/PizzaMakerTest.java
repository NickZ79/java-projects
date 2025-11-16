import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaMakerTest {

    private PizzaMaker pizzaMaker;

    @BeforeEach
    public void setup() {
        pizzaMaker = new PizzaMaker();
    }

    @Test
    public void verifyMakeCheesePizzaNoDelivery() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Cheese());

        Pizza actual = pizzaMaker.makePizza(ingredients, false);

        assertEquals(5.0, actual.getTotalCost());
        assertArrayEquals(ingredients.toArray(), actual.getIngredients().toArray());
        assertFalse(actual.isDeliveryYn());
    }

    @Test
    public void verifyMakeCheesePizzaWithDelivery() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Cheese());

        Pizza actual = pizzaMaker.makePizza(ingredients, true);

        assertEquals(8.0, actual.getTotalCost());
        assertArrayEquals(ingredients.toArray(), actual.getIngredients().toArray());
        assertTrue(actual.isDeliveryYn());
    }

    @Test
    public void verifyMakeCheeseTwoMeatsPizzaWithDelivery() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Cheese());
        ingredients.add(new Pepperoni());
        ingredients.add(new Ham());

        Pizza actual = pizzaMaker.makePizza(ingredients, true);

        assertEquals(12.0, actual.getTotalCost());
        assertArrayEquals(ingredients.toArray(), actual.getIngredients().toArray());
        assertTrue(actual.isDeliveryYn());
    }

    @Test
    public void verifyMakeCheeseOneVegetablePizzaWithDelivery() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Cheese());
        ingredients.add(new Mushroom());

        Pizza actual = pizzaMaker.makePizza(ingredients, true);

        assertEquals(9.0, actual.getTotalCost());
        assertArrayEquals(ingredients.toArray(), actual.getIngredients().toArray());
        assertTrue(actual.isDeliveryYn());
    }

    @Test
    public void verifyMakeCheeseTwoMeatsOneVegetablePizzaWithNoDelivery() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Cheese());
        ingredients.add(new Pepperoni());
        ingredients.add(new Ham());
        ingredients.add(new GreenPepper());

        Pizza actual = pizzaMaker.makePizza(ingredients, false);

        assertEquals(10.0, actual.getTotalCost());
        assertArrayEquals(ingredients.toArray(), actual.getIngredients().toArray());
        assertFalse(actual.isDeliveryYn());
    }
}
