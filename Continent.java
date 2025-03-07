import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Continent {

    public static void main(String[] args) {

        HashMap<String, Set<String>> continents = new HashMap<>();

        Set<String> asia = new HashSet<>();
        Set<String> africa = new HashSet<>();
        Set<String> australia = new HashSet<>();
        Set<String> europe = new HashSet<>();
        Set<String> southamerica = new HashSet<>();
        Set<String> northamerica = new HashSet<>();
        Set<String> antarctica = new HashSet<>();

        asia.add("China");
        asia.add("India");
        africa.add("Nigeria");
        africa.add("Ghana");
        australia.add("Australia");
        europe.add("Germany");
        europe.add("Greece");
        southamerica.add("Argentina");
        southamerica.add("Bolivia");
        northamerica.add("Canada");
        northamerica.add("Mexico");
        antarctica.add("Australia");
        antarctica.add("Chile");
        continents.put("AS", asia);
        continents.put("EU", europe);
        continents.put("SOUTH", southamerica);
        continents.put("NORTH", northamerica);
        continents.put("Alkebulan", africa);
        continents.put("ANT", antarctica);

        System.out.println(continents.values());




    }
}
