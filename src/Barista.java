import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {
    private final List<Coffee> coffees = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final CoffeeMaker maker = new CoffeeMaker();

    public void orderCofee() {

        System.out.println("Choose coffee type:");
        for (CoffeeType type : CoffeeType.values()){
            System.out.println(" - " + type);
        }
        CoffeeType coffeeType = CoffeeType.valueOf(scanner.nextLine().toUpperCase().trim().replace(
                " ", ""));

        System.out.println("Choose intensity: ");
        for (Intensity i : Intensity.values()){
            System.out.println(" - " + i);
        }
        Intensity intensity = Intensity.valueOf(scanner.nextLine().toUpperCase());

        CoffeeMaker maker = new CoffeeMaker();
        Coffee coffee = null;
        switch (coffeeType) {
            case CAPPUCCINO: { coffee = maker.makeCappuccino(intensity, 150); break; }
            case AMERICANO: { coffee = maker.makeAmericano(intensity, 100); break; }
            case PUMPKINSPICELATTE: { coffee = maker.makePumpkinSpiceLatte(intensity, 50, 10); break; }
            case SYRUPCAPPUCCINO: { coffee = maker.makeSyrupCappuccino(intensity, 75,
                    SyrupType.VANILLA); break;}
        }

        coffees.add(coffee);
        System.out.println("Coffee added! Total coffees: " + coffees.size() + "\nAnything else?");
    }

    public void printAllDetails() {
        System.out.println("\n~~~ All ordered coffees ~~~");
        for (Coffee i : coffees) {
            i.printCoffeeDetails();
            System.out.println();
        }
    }
}