import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.println("<h1>");
        System.out.printf("\t%s\n", title);
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.printf("\t%s\n", content);
        System.out.println("</article>");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of comments")) {
                break;
            }
            System.out.println("<div>");
            System.out.println("\t" + input);
            System.out.println("</div>");
        }
    }
}
