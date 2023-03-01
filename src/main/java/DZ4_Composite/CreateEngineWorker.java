package DZ4_Composite;

public class CreateEngineWorker implements Worker{

    @Override
    public void createCar() {
        System.out.println("Первый работник собирает двигатель");
    }
}
