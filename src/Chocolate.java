public class Chocolate extends FlavourDecorator {
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    public double cost() {
        return beverage.cost() + 3;
    }
}
