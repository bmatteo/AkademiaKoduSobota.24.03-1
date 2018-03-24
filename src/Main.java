import java.util.Collections;

public class Main {
    public static void main(String[] args) {


      FamilyCar familyCar = new FamilyCar("BMW","M3","red",
              220,2000,7,
              10,"111111");

        FamilyCar familyCar2 = new FamilyCar("Audi","M3","red",
                300,2000,8,
                10,"111111");

        FamilyCar familyCar3 = new FamilyCar("Nissan","M3","red",
                180,2000,8,
                10,"111111");

        FamilyCar familyCar4 = new FamilyCar("Honda","M3","red",
                130,2000,8,
                10,"111111");


        Collections.sort(CarRepository.carsList, new Car.CarComparator2());

        Flow.start();

    }
}
