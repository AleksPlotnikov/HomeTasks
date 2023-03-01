package DZ2_Adapter;

public class AdapterForCarsConsumer extends ConsumerCars implements CarFactory{

    @Override
    public void defaultPowerEngine() {
        ConsumerPowerEngine();
    }

    @Override
    public void defaultCarColor() {
        ConsumerCarColor();
    }

    @Override
    public void defaultCarBody() {
        ConsumerCarBody();
    }

    @Override
    public void defaultSpeedMeter() {
        ConsumerSpeedMeter();
    }
}

