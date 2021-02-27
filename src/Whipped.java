public class Whipped extends CondimentDecorator {

    public Whipped(Beverage beverage) {
        this.beverage = beverage;
        description = "Whipped";
    }

    public double cost() {

        return beverage.cost() + 1.00;
    }
    public String getDescription() {

        return beverage.getDescription() + ", Whipped";
    }
}
