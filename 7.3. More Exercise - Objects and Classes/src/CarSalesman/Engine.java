package CarSalesman;

public class Engine {
    String model;
    String power;
    String displacement;
    String efficiency;

    Engine(String model, String power) {
        this.model = model;
        this.power = power;
        displacement = "n/a";
        efficiency = "n/a";
    }
    Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    Engine(String model, String power, String displacementOrEfficiency) {
        this.model = model;
        this.power = power;
        if (displacementOrEfficiency.charAt(0) >= 65 && displacementOrEfficiency.charAt(0) <= 90) {
            efficiency = displacementOrEfficiency;
            displacement = "n/a";
        } else {
            displacement = displacementOrEfficiency;
            efficiency = "n/a";
        }
    }
}
