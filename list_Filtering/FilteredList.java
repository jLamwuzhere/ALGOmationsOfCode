package list_Filtering;

//import java.util.ArrayList;				// USED FOR METHOD 1
import java.util.List;
import java.util.stream.Collectors;		// USED FOR METHOD 2

public class FilteredList {
//	//-------------METHOD 1 - STRING -----------
//	// Returns a List object after taking a List object as an argument.
//	//								Object can't be changed in method because it's final
//	public static List<Object> filterList(final List<Object> list) {
//		// Creating an ArrayList named "filteredList"
//	    List<Object> filteredList = new ArrayList<>();
//	    for (int i = 0; i < list.size(); i++) {
//	    	//				use "get" keyword for Objects
//	        Object obj = list.get(i);
//	        // use "instanceof" keyword to check if it's an instance of the Integer class.
//	        if (obj instanceof Integer) {
//	        	// if it is use "add" keyword to push to the filteredList in List interfaces. Push is used for stack interfaces.
//	            filteredList.add(obj);
//	        }
//	    }
//	    // print our filteredList out
//	    System.out.println(filteredList);
//	    return filteredList;
//	}
	
	
	//-------------METHOD 2 - STREAMS -----------
	public static List<Object> filterList(final List<Object> list) {
		// Create a List of Objects called "filteredList, so that we can print our result out.
									//run a stream
		List<Object> filteredList = list.stream()
			//	Filter out anything that belongs to Integer class
			.filter(e -> e instanceof Integer)
			// Collect the remainder back up and throw in a newList
			.collect(Collectors.toList());
			// Print our List
			System.out.println(filteredList);
			return filteredList;
	  }
	
	
	// --------------MAIN METHOD--------------	
	public static void main(String[] args) {
		filterList(List.of(1, 2, "a", "b"));
		filterList(List.of(1, "a", "b", 0, 15));
		filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123));
	}
}
