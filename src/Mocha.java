public class Mocha extends  CondimentDecorator {

    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = "Mocha";
    }
    public double cost() {
        return beverage.cost() + .20;
    }
    public String getDescription() {

        return beverage.getDescription() + ", Mocha";
    }
}
