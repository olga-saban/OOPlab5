public class PumpkinSpiceLatte extends Cappuccino {
    protected int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk,
                             int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.name = "Pumpkin Spice Latte";

        if (mgOfPumpkinSpice < 0) {
            throw new IllegalArgumentException("mgOfPumpkinSpice should be greater than 0");
        }
        else {
            this.mgOfPumpkinSpice = mgOfPumpkinSpice;
        }
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }
    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("\nCoffee name: " + name);
        System.out.println("Coffee intensity: " + intensity);
        System.out.println("Coffee ml of milk: " + mlOfMilk);
        System.out.println("Coffee mg of pumpkin spice: " + mgOfPumpkinSpice);
    }
}
