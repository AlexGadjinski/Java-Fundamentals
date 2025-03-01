import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("course start")) {
                break;
            }
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add":
                    String lessonToAdd = command[1];
                    if (!lessons.contains(lessonToAdd)) {
                        lessons.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = command[1];
                    int index = Integer.parseInt(command[2]);
                    if (!lessons.contains(lessonToInsert)) {
                        lessons.add(index, lessonToInsert);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = command[1];
                    if (lessons.contains(lessonToRemove) && lessons.contains(lessonToRemove + "-Exercise")) {
                        lessons.remove(lessonToRemove);
                        lessons.remove(lessonToRemove + "-Exercise");
                    } else {
                        lessons.remove(lessonToRemove);
                    }
                    break;
                case "Swap":
                    String lesson1 = command[1];
                    String lesson2 = command[2];
                    if (lessons.contains(lesson1) && lessons.contains(lesson2)) {
                        int index1 = lessons.indexOf(lesson1);
                        int index2 = lessons.indexOf(lesson2);
                        lessons.set(index1, lesson2);
                        lessons.set(index2, lesson1);
                        if (lessons.contains(lesson1 + "-Exercise")) {
                            lessons.remove(index1 + 1);
                            lessons.add(index2 + 1, lesson1 + "-Exercise");
                        }
                        if (lessons.contains(lesson2 + "-Exercise")) {
                            lessons.remove(index2 + 1);
                            lessons.add(index1 + 1, lesson2 + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = command[1];
                    if (lessons.contains(exercise) && !lessons.contains(exercise + "-Exercise")) {
                        int lessonIndex = lessons.indexOf(exercise);
                        lessons.add(lessonIndex + 1, exercise + "-Exercise");
                    }
                    else if (!lessons.contains(exercise)) {
                        lessons.add(exercise);
                        lessons.add(exercise + "-Exercise");
                    }
                    break;
            }
        }
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(i + 1 + "." + lessons.get(i));
        }
    }
}
