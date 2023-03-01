package DZ4_Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker){
        workers.add(worker);
    }
    public void removeWorker(Worker worker){
        workers.remove(worker);
    }
    public void createCar(){
        System.out.println("Команда производит автомобиль");
        for(Worker workers : workers){
            workers.createCar();
        }
    }
}
