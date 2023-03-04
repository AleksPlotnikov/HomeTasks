package DZ4_Composite;

public class DZ4_Composite {
    public static void main(String[] args) {
        Team team = new Team();

        Worker firstWorker = new CreateEngineWorker();
        Worker secondWorker = new CreatePaintingBody();
        Worker thirdWorker = new CreateShassiAssembly();

        team.addWorker(firstWorker);
        team.addWorker(secondWorker);
        team.addWorker(thirdWorker);

        team.createCar();

    }
}
