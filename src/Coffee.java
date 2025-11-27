public class Coffee {
    protected Intensity intensity;
    protected String name;

    public Coffee(String name, Intensity intensity) {
        this.intensity = intensity;
        this.name = name;
    }

    public Intensity getIntensity() {
        return intensity;
    }
    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }
    public String getName() {
        return name;
    }

    public void printCoffeeDetails() {
        System.out.println("\nCoffee name: " + name);
        System.out.println("Coffee intensity: " + intensity);
    }

}
