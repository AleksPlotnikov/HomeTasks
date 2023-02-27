package DZ2;

public class DZ2_Adapter {

    public static void main(String[] args) {
        CarFactory carFactory = new AdapterForCarsConsumer();

        carFactory.defaultPowerEngine();
        carFactory.defaultCarColor();
        carFactory.defaultCarBody();
        carFactory.defaultSpeedMeter();
    }
}
