package Indiana03;
import java.util.Arrays;
import java.lang.reflect.Array;

public class IndianaVariables {
    public static void main(String[] args) {
        String movieName = "Last cruisade";
        boolean isSeen = true;
        int yearOfRelease = 1989;
        float noteImdb = 8.2f;
        //double[] test = new double[10];

        String[] weaponListIndi = {"saber", "gun", "whip"};
        String[] weaponListLaura = {"knife", "shield"};
        String[] weaponListRavenwood = {"belt", "dagger", "gun", "shield"};
        String[][] allWeapons = {weaponListIndi, weaponListLaura, weaponListRavenwood};

        System.out.println(movieName);
        System.out.println(weaponListIndi[0]);
        //System.out.println(test[0]);
        System.out.println(
                Arrays
                    .toString(weaponListIndi)
                    .replaceAll("[\\[\\]]", "")
        //entre [] permet de faire une liste, \\ permet d'échapper un caractère spécial
        );
        for(String weapon: weaponListIndi) {
            System.out.println(weapon);
        };
        String[][] actors = {
                {"johnny", "Bobby", "Manny"},
                {"Elie", "Mary", "Tommy"},
                {"Vicky","Sandy", "Rudy"}
        };
        String[] movies = {"Last Cruisade", "Riders of the lost arch", "Temple of doom"};

        for(int i = 0; i < movies.length; i++) {
            String movieActors = Arrays.toString(actors[i]).replaceAll("[\\[\\]]", "");
            System.out.println("dans le film " +movies[i]+ ", les meilleurs acteurs sont : " +movieActors);
        }
    }
}
