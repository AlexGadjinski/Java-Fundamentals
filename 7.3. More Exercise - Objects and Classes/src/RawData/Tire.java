package RawData;

public class Tire {
    double tierOnePressure;
    int tierOneAge;
    double tierTwoPressure;
    int tierTwoAge;
    double tierThreePressure;
    int tierThreeAge;
    double tierFourPressure;
    int tierFourAge;

    Tire(String tierOnePressure, String tierOneAge, String tierTwoPressure, String tierTwoAge,
    String tierThreePressure, String tierThreeAge, String tierFourPressure, String tierFourAge) {
        this.tierOnePressure = Double.parseDouble(tierOnePressure);
        this.tierOneAge = Integer.parseInt(tierOneAge);
        this.tierTwoPressure = Double.parseDouble(tierTwoPressure);
        this.tierTwoAge = Integer.parseInt(tierTwoAge);
        this.tierThreePressure = Double.parseDouble(tierThreePressure);
        this.tierThreeAge = Integer.parseInt(tierThreeAge);
        this.tierFourPressure = Double.parseDouble(tierFourPressure);
        this.tierFourAge = Integer.parseInt(tierFourAge);
    }

    boolean isFragile() {
        if (tierOnePressure < 1 || tierTwoPressure < 1 || tierThreePressure < 1 || tierFourPressure < 1) {
            return true;
        }
        return false;
    }
}
