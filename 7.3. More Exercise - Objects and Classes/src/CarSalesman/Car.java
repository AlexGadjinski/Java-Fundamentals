package CarSalesman;

import java.util.List;

public class Car {
    String model;
    Engine engine;
    String weight;
    String color;

    Car(List<Engine> engineList, String model, String engine) {
        this.model = model;
        for (int i = 0; i < engineList.size(); i++) {
            if (engine.equals(engineList.get(i).model)) {
                this.engine = engineList.get(i);
                break;
            }
        }
        weight = "n/a";
        color = "n/a";
    }
    Car(List<Engine> engineList, String model, String engine, String weight, String color) {
        this.model = model;
        for (int i = 0; i < engineList.size(); i++) {
            if (engine.equals(engineList.get(i).model)) {
                this.engine = engineList.get(i);
                break;
            }
        }
        this.weight = weight;
        this.color = color;
    }
    Car(List<Engine> engineList, String model, String engine, String weightOrColor) {
        this.model = model;
        for (int i = 0; i < engineList.size(); i++) {
            if (engine.equals(engineList.get(i).model)) {
                this.engine = engineList.get(i);
                break;
            }
        }
        if (weightOrColor.charAt(0) >= 48 && weightOrColor.charAt(0) <= 57) {
            weight = weightOrColor;
            color = "n/a";
        } else {
            weight = "n/a";
            color = weightOrColor;
        }
    }
}
