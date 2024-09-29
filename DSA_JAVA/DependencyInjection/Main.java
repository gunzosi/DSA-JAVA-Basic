package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        EngineChina engineChina = new EngineChina();
        EngineUSA engineUSA = new EngineUSA();
        Car car = new Car("Diesel", "V8",  engineUSA);
        System.out.println("Engine Type: " + car.getEngineType());
        System.out.println("Engine Model: " + car.getEngineModel());
        car.getEngineChina().startEngine();
    }
}
