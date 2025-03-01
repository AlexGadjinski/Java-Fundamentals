package RawData;

public class Cargo {
    int cargoWeight;
    String cargoType;
    Engine engine;
    Tire tires;
    boolean isFragile;
    boolean isFlamable;

    Cargo(String cargoWeight, String cargoType, String engineSpeed, String enginePower,
          String tierOnePressure, String tierOneAge, String tierTwoPressure, String tierTwoAge,
          String tierThreePressure, String tierThreeAge, String tierFourPressure, String tierFourAge) {
        this.cargoWeight = Integer.parseInt(cargoWeight);
        this.cargoType = cargoType;
        engine = new Engine(engineSpeed, enginePower);
        tires = new Tire(tierOnePressure, tierOneAge, tierTwoPressure, tierTwoAge,
                tierThreePressure, tierThreeAge, tierFourPressure, tierFourAge);

        isFragile = tires.isFragile();
        isFlamable = engine.isFlamable();
    }
}
