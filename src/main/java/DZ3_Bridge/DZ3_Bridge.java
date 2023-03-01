package DZ3_Bridge;

public class DZ3_Bridge {
    public static void main(String[] args) {
        Program [] programs = {
                new Sedan(new FirstFactoryLine()),
                new Jeep(new SecondFactoryLine())
        };

        for(Program programForFactory : programs){
            programForFactory.workingFactory();
        }
    }
}
