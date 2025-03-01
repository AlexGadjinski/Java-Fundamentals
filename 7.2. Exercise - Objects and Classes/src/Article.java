import java.util.Scanner;

public class Article {
    String title;
    String content;
    String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void rename(String newTitle) {
        title = newTitle;
    }
    public void edit(String newContent) {
        content = newContent;
    }
    public void changeAuthor(String newAuthor) {
        author = newAuthor;
    }
    public void ToString() {
        System.out.println(title + " - " + content + ": " + author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());

        Article article = new Article(input[0], input[1], input[2]);

        for (int i = 0; i < n; i++) {
           String[] command = scanner.nextLine().split(": ");
           switch (command[0]) {
               case "Rename":
                   article.rename(command[1]);
                   break;
               case "Edit":
                   article.edit(command[1]);
                   break;
               case "ChangeAuthor":
                   article.changeAuthor(command[1]);
                   break;
           }
        }
        article.ToString();
    }
}
