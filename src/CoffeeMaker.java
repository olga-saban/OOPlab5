public class CoffeeMaker {
    public Cappuccino makeCappuccino(Intensity intensity, int mlOfMilk) {
        System.out.println("\n~~~ Making Cappuccino ~~~");
        System.out.println("1. Grinding coffee beans (" + intensity + ")");
        System.out.println("2. Brewing espresso shot");
        System.out.println("3. Steaming " + mlOfMilk + " ml of milk");
        System.out.println("4. Pouring milk into espresso");
        System.out.println("5. Adding milk foam on top");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        return new Cappuccino(intensity, mlOfMilk);
    }

    public PumpkinSpiceLatte makePumpkinSpiceLatte(Intensity intensity, int mlOfMilk,
                                             int mgOfPumpkinSpice) {
        System.out.println("~~~ Making Pumpkin Spice Latte ~~~");
        Cappuccino base =  makeCappuccino(intensity, mlOfMilk);
        System.out.println("6. Adding " + mgOfPumpkinSpice + " mg of pumpkin spice");
        System.out.println("7. Stirring gently");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        return new PumpkinSpiceLatte(base.getIntensity(), base.getMlOfMilk(), mgOfPumpkinSpice);
    }

    public SyrupCappuccino makeSyrupCappuccino(Intensity intensity, int mlOfMilk,
                                            SyrupType syrupType) {
        System.out.println("~~~ Making Syrup Cappuccino ~~~");
        Cappuccino base = makeCappuccino(intensity, mlOfMilk);
        System.out.println("6. Adding " + syrupType + " syrup");
        System.out.println("7. Stirring gently");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return new SyrupCappuccino(base.getIntensity(), base.getMlOfMilk(), syrupType);
    }

    public Americano makeAmericano(Intensity intensity, int mlOfWater) {
        System.out.println("\n~~~ Making Americano ~~~");
        System.out.println("1. Grinding coffee beans (" + intensity + ")");
        System.out.println("2. Brewing espresso shot");
        System.out.println("3. Adding " + mlOfWater + " ml of hot water");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return new Americano(intensity, mlOfWater);
    }
}
