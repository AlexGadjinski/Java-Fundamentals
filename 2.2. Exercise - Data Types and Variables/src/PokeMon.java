import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine());

        int pokedTargets = 0;
        int originalPokePower = pokePower;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokedTargets++;
            if (pokePower == originalPokePower/2 && exhaustionFactor > 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
