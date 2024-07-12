package factoryPattern.californiaStylePizzas;

import factoryPattern.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza{

    public CaliforniaStyleVeggiePizza() {
        name = "California Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }

}
