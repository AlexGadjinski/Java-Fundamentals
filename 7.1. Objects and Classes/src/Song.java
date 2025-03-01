import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String type;
    private String name;
    private String time;
    Song(String type, String name, String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberSongs; i++) {
            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];
            Song currentSong = new Song(type, name, time);
            songs.add(currentSong);
        }
        String print = scanner.nextLine();
        if (print.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getType().equals(print)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
