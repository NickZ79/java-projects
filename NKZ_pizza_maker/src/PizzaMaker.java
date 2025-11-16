package edu.hfcc.pizza;

import edu.hfcc.pizza.ingredient.Ingredient;

import java.util.ArrayList;

/*
    This program calculates the total price the pizza based open varying toppings and delivery

    You will need a pizza class which the following attributes  ingredients, delivery, and total cost.
    Some attributes should be initialized with constructor others with setter

    Suggest creating a class to calculate the actual total cost of the pizza

    Base pizza with cheese is 5.00
    delivery is 3.00
    All meat ingredients are 2.00
    All vegetable ingredients are 1.00
    Cheese is no cost

    All ingredients have attributes of name and cost

    Remember to use inheritance for the ingredients you will need to create additional classes so information is not
    repeated
    If implementation done correctly the only if statement needed is whether to add the delivery
    charge to the total cost

    Remember to run all the tests
 */
public class PizzaMaker {

    public Pizza makePizza(ArrayList<Ingredient> ingredients, boolean deliverYn){
        Pizza pizza = new Pizza(ingredients, deliverYn);

        double total = 5.00;
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
