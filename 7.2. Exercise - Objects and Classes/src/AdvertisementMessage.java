import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.",
                "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int i = 0; i < n; i++) {
            String phrase = random(phrases, phrases.length);
            String event = random(events, events.length);
            String author = random(authors, authors.length);
            String city = random(cities, cities.length);
            System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
        }
    }
    public static String random(String[] array, int length) {
        Random rnd = new Random();
        int random = rnd.nextInt(length);
        return array[random];
    }
}
