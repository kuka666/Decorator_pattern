public class Main {

    static void printCoffee(Beverage beverage) {
        System.out.println("Beverage is  " + beverage.getDescription() + ". Cost: " + beverage.cost());
    }

    public static void main(String args[]) throws Exception {
        Beverage espresso = new Espresso();
        Beverage Cappuchino = new Cappuchino();

        Milk cappwithMilk = new Milk(Cappuchino);
        printCoffee(cappwithMilk);
        System.out.println("-------------------------");

        Chocolate cappwithMilkandChoc = new Chocolate(cappwithMilk);
        printCoffee(cappwithMilkandChoc);
        System.out.println("-------------------------");

        Milk alless = new Milk(new Chocolate(espresso));
        printCoffee(alless);
        System.out.println("-------------------------");

    }
}