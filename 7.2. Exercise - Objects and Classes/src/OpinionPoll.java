import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person {
        private String name;
        private String age;
        private Person(String name, String age) {
           this.name = name;
           this.age = age;
        }
        public String getName() {
            return name;
        }
        public String getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (Integer.parseInt(input[1]) > 30) {
                Person current = new Person(input[0], input[1]);
                personList.add(current);
            }
        }
        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
