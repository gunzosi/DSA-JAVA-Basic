package DependencyInjection;

public class Car {
    private String engineType;
    private String engineModel;
    private Engine engine;

    public Car() {
    }

    public Car(String engineType, String engineModel, Engine engine) {
        this.engineType = engineType;
        this.engineModel = engineModel;
        this.engine = engine;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public Engine getEngineChina() {
        return engine;
    }

    public void setEngineChina(Engine engineChina) {
        this.engine = engineChina;
    }
}
