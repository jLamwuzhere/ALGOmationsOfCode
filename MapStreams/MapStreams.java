package MapStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MapStreams {
	
    public static void main(String[] args) {
    	List<List<List<Integer>>> li = List.of(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList(7, 8, 9)
                )
        );
    	System.out.println(".map: ");
        li.stream().map(Collection::stream).forEach(System.out::println);
        System.out.println("--------------------------------");
        System.out.println(".flatmap: ");
        li.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
