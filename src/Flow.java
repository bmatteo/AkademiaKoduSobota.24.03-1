import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {

    public static void start(){

        boolean exitFlag = false;
        do {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println();
            int choice = Menu.mainScreen();

            switch (choice) {
                case 1:
                    typeCarFlow();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println();
                    CarRepository.showCars();
                    break;
                case 3:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);

        System.exit(0);
    }

    private static void typeCarFlow() {
        int choise = Menu.carTypeScreen();
        CarDataWrapper cdw;
        Scanner scanner;
        switch (choise) {
            case 1:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.print("Seat numbers: ");
                int seats = scanner.nextInt();

                FamilyCar fc = new FamilyCar(cdw, seats);
                break;
            case 2:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.print("Seat numbers: ");
                int seatsNumber = scanner.nextInt();
                System.out.print("Standing places: ");
                int standingPlaces = scanner.nextInt();
                System.out.print("Length: ");
                double length = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();

                Bus b = new Bus(cdw, seatsNumber, standingPlaces, length, height);
                break;

        }
    }

    private static CarDataWrapper readMainParameters() {
        Scanner scanner = new Scanner(System.in);

        CarDataWrapper carDataWrapper = new CarDataWrapper();

            System.out.print("Brand: ");
            carDataWrapper.brand = scanner.nextLine();
            System.out.print("Model: ");
            carDataWrapper.model = scanner.nextLine();
            System.out.print("Color: ");
            carDataWrapper.color = scanner.nextLine();
            carDataWrapper.rentPrice = ourScanner("Rent Price");
            carDataWrapper.power = ourScanner("Power");
            System.out.print("Engine capacity: ");
            carDataWrapper.engineCapasity = scanner.nextInt();
            System.out.print("Fuel consumption: ");
            carDataWrapper.fuelConsumption = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Registration number: ");
            carDataWrapper.registrationNumber = scanner.nextLine();

        return carDataWrapper;
    }

    public static int ourScanner(String paramenterName) {
        int result = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(paramenterName + ": ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Zepsuło się !!");
                continue;
            }
            break;
        }
        return result;
    }
}
