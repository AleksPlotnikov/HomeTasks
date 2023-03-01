package DZ3_Bridge;

public class Sedan extends Program{
    protected Sedan(Factory factory) {
        super(factory);
    }

    @Override
    public void workingFactory() {
        factory.makeCar();
        System.out.println("Now produced Sedan");
    }
}
