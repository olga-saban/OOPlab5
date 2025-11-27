public class Americano extends Coffee {
    protected int mlOfWater;

    public Americano(Intensity intensity, int mlOfWater) {
        super("Americano", intensity);

        if (mlOfWater < 0) {
            throw new IllegalArgumentException("mlOfWater should be greater than 0");
        }
        else {
            this.mlOfWater = mlOfWater;
        }
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        System.out.println("\nCoffee name: " + name);
        System.out.println("Coffee intensity: " + intensity);
        System.out.println("Coffee ml of water: " + mlOfWater);
    }
}
