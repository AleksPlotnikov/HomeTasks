package DZ3_Bridge;

public abstract class Program {
    protected Factory factory;

    protected Program(Factory factory){
        this.factory = factory;
    }

    public abstract void workingFactory();
}
