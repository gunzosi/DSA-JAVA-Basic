package DependencyInjection;

public class EngineUSA implements Engine{

    @Override
    public void startEngine() {
        System.out.println("EngineUSA started...brm brm brm!!!");
    }

    public void stopEngine() {
            System.out.println("EngineUSA stopped...brm brm brm");
    }

    public EngineUSA() {
    }
}
