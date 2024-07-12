package factoryPattern;

import factoryPattern.californiaStylePizzas.CaliforniaStyleCheesePizza;
import factoryPattern.californiaStylePizzas.CaliforniaStyleClamPizza;
import factoryPattern.californiaStylePizzas.CaliforniaStylePepperoniPizza;
import factoryPattern.californiaStylePizzas.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
