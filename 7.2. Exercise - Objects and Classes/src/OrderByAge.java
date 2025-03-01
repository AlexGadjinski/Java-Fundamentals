import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    String name;
    String identity;
    int age;
    public OrderByAge(String name, String identity, String age) {
        this.name = name;
        this.identity = identity;
        this.age = Integer.parseInt(age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderByAge> people = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] command = input.split(" ");
            OrderByAge person = new OrderByAge(command[0], command[1], command[2]);
            people.add(person);
        }
        for (int i = 0; i < people.size();) {
            int minAge = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < people.size(); j++) {
                if (people.get(j).age < minAge) {
                    minAge = people.get(j).age;
                    index = j;
                }
            }
            System.out.printf("%s with ID: %s is %d years old.\n",
                    people.get(index).name, people.get(index).identity, minAge);
            people.remove(index);
        }
    }
}
