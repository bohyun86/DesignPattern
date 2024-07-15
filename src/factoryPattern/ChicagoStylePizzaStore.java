package factoryPattern;

import factoryPattern.chicagoStylePizzas.ChicagoStyleCheesePizza;
import factoryPattern.chicagoStylePizzas.ChicagoStyleClamPizza;
import factoryPattern.chicagoStylePizzas.ChicagoStylePepperoniPizza;
import factoryPattern.chicagoStylePizzas.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
