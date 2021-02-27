public class Main {

    public static void main(String[] args) {

        Beverage beverage = new HouseBlend();

        System.out.println(beverage.getDescription() + " " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        beverage = new Whipped(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }
}
