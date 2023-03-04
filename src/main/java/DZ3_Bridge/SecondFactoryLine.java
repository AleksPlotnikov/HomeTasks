package DZ3_Bridge;

public class SecondFactoryLine implements Factory{
    @Override
    public void makeCar() {
        System.out.println("SecondFactoryLine working");
    }
}
