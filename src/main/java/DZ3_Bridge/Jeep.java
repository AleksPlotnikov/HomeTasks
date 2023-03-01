package DZ3_Bridge;

public class Jeep extends Program{
    protected Jeep(Factory factory) {
        super(factory);
    }

    @Override
    public void workingFactory() {
        factory.makeCar();
        System.out.println("Now produced Jeep");
    }
}
