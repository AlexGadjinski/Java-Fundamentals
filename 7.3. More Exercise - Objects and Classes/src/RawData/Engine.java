package RawData;

public class Engine {
    int engineSpeed;
    int enginePower;

    Engine(String engineSpeed, String enginePower) {
        this.engineSpeed = Integer.parseInt(engineSpeed);
        this.enginePower = Integer.parseInt(enginePower);
    }

    boolean isFlamable() {
        if (enginePower > 250) {
            return true;
        }
        return false;
    }
}
