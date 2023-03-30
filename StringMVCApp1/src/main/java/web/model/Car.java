package web.model;


public class Car {
    private final String nameCar;
    private final int serias;
    private final int spedTest;

    public Car(String nameCar, int serias, int spedTest) {
        this.nameCar = nameCar;
        this.serias = serias;
        this.spedTest = spedTest;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getSerias() {
        return serias;
    }

    public int getSpedTest() {
        return spedTest;
    }

    public static void main(String[] args) {

    }
}
