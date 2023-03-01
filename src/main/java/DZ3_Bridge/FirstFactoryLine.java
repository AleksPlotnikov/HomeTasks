package DZ3_Bridge;

public class FirstFactoryLine implements Factory {

    @Override
    public void makeCar() {
        System.out.println("FirstFactoryLine working");
    }
}
