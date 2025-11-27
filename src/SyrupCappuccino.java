public class SyrupCappuccino extends Cappuccino {
    protected SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.name = "Syrup Cappuccino";
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }
    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("\nCoffee name: " + name);
        System.out.println("Coffee intensity: " + intensity);
        System.out.println("Coffee ml of milk: " + mlOfMilk);
        System.out.println("Coffee syrup type: " + syrup);
    }
}
