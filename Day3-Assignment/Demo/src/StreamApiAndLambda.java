import java.util.ArrayList;
import java.util.List;

public class StreamApiAndLambda {
	static List<String> places = new ArrayList<>();

    public static List getPlaces(){

        // add places and country to the list
        places.add("Karnataka, Bengaluru");
        places.add("Karnataka, Mangalore");
        places.add("India, Delhi");
        places.add("Tamilnadu,  chennai");
        places.add("Africa, Nigeria");

        return places;
    }
public static void main(String[] args) {
    List<String> myPlaces = getPlaces();
   
    System.out.println("Places from Karnataka:");
    
    // Filter places from Nepal
    myPlaces.stream()
            .filter((p) -> p.startsWith("Karnataka"))
            .map((p) -> p.toUpperCase())
            .sorted()
            .forEach((p) -> System.out.println(p));

}}