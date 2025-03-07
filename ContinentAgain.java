import java.util.LinkedList;

public class ContinentAgain {

    public static void main(String[] args) {

        LinkedList<String> continents = new LinkedList<String>();
        continents.add("Asia");
        continents.add("Africa");
        continents.add("Europe");
        continents.add("South America");
        continents.add("North America");
        continents.add("Antarctica ");
        System.out.println(continents.addAll(continents));
        System.out.println(continents);
        System.out.println(continents.removeFirst());

    }
}
