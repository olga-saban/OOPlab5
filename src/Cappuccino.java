public class Cappuccino extends Coffee {
    protected int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super("Cappuccino", intensity);

        if (mlOfMilk < 0) {
            throw new IllegalArgumentException("mlOfMilk should be greater than 0");
        }
        else {
            this.mlOfMilk = mlOfMilk;
        }
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }
    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("\nCoffee name: " + name);
        System.out.println("Coffee intensity: " + intensity);
        System.out.println("Coffee ml of milk: " + mlOfMilk);
    }


}
