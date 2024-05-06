package DecoratorPattern;

public class Decaffeine extends Beverage {
    public Decaffeine() {
        description = "디카페인 커피";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
