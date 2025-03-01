package groomingSalon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroomingSalon {
    List<Pet> data;
    int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name) && data.get(i).getOwner().equals(owner)) {
                return data.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        List<String> result = new ArrayList<>(Arrays.asList("The grooming salon has the following clients:"));
        for (int i = 0; i < data.size(); i++) {
            String name = data.get(i).getName();
            String owner = data.get(i).getOwner();
            result.add(name + " " + owner);
        }
        return String.join(System.lineSeparator(), result);
    }
}
