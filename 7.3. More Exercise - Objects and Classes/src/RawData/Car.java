package RawData;

public class Car {
    String model;
    Cargo cargo;

    Car(String model, String engineSpeed, String enginePower, String cargoWeight, String cargoType,
        String tierOnePressure, String tierOneAge, String tierTwoPressure, String tierTwoAge,
        String tierThreePressure, String tierThreeAge, String tierFourPressure, String tierFourAge) {
        this.model = model;

        cargo = new Cargo(cargoWeight, cargoType, engineSpeed, enginePower,
                tierOnePressure, tierOneAge, tierTwoPressure, tierTwoAge,
                tierThreePressure, tierThreeAge, tierFourPressure, tierFourAge);
    }
}
