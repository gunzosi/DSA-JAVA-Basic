package DependencyInjection;

public class EngineChina implements Engine{

    @Override
    public void startEngine() {
        System.out.println("EngineChina started...brm brm brm!!!");
    }

    public void stopEngine() {
        System.out.println("EngineChina stopped...brm brm brm");
    }

    public EngineChina() {
    }
}
