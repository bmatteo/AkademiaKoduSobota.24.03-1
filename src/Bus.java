public class Bus extends Car{

    private int seatsNumber, standingPlaces;
    private double length, height;

    public Bus(String brand, String model, String color,
               int power, int engineCapasity, double fuelConsumption,
               String registrationNumber, int seatsNumber,int standingPlaces,
               double length, double height) {
        super(brand, model, color, power, engineCapasity,
                fuelConsumption, registrationNumber);
        createMainBusParameters(seatsNumber,standingPlaces,
        length, height);

    }

    public Bus(CarDataWrapper carDataWrapper, int seatsNumber, int standingPlaces,
               double length, double height) {
        super(carDataWrapper);
        createMainBusParameters(seatsNumber,standingPlaces,
                length, height);
    }

    private void createMainBusParameters(int seatsNumber, int standingPlaces,
                                         double length, double height) {
        this.seatsNumber=seatsNumber;
        this.standingPlaces=standingPlaces;
        this.height=height;
        this.length=length;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                ", seatsNumber=" + seatsNumber +
                ", standingPlaces=" + standingPlaces +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
