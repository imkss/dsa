package __OOP.Interfaces;

public class NiceCar {
    private final Engine engine;

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar (Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

}
