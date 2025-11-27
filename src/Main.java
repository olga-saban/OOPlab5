import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var barista = new Barista();

        boolean callBarista = true;

        while (callBarista) {
            System.out.println("\n1. Order coffee");
            System.out.println("2. Exit");
            int opt = scanner.nextInt();
            scanner.nextLine();

            if (opt == 1)
                barista.orderCofee();
            else
                callBarista = false;
        }

        barista.printAllDetails();
    }
}