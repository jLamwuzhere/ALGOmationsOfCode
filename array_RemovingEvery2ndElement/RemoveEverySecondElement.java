package array_RemovingEvery2ndElement;

import java.util.ArrayList;				//FOR METHOD 1
import java.util.Arrays;				//FOR METHODS 1 AND 2
//import java.util.stream.IntStream;			//FOR METHOD 3

public class RemoveEverySecondElement {
//	//-------------METHOD 1 -----------
	public static Object[] removeEveryOther(Object[] arr) {
		if (arr == null) {
            System.out.println("Empty or null");
            return arr;
        }
		else if (arr.length == 0) {
            System.out.println("Empty");
            return arr;
        } 
		else if (arr.length == 1 && arr[0] == null) {
            System.out.println("Length 1 with null. Returning null.");
            return null; // Return null directly if the array contains only one null element
        } 
		else if (arr.length == 1) {
            System.out.println("Length 1. No removals.");
            return arr;
		}
		else {
            ArrayList<Object> arrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i += 2) {
                arrayList.add(arr[i]);
                System.out.println("keeping '" + arr[i] + "'");
            }
            System.out.println("Your modified array: " + Arrays.toString(arrayList.toArray()));
            return arrayList.toArray(new Object[0]);
		}
    }
	
	
	
//	//-------------METHOD 2 -----------
//	public static Object[] removeEveryOther(Object[] arr) {
//	    Object[] output = new Object[(arr.length + 1) / 2];
//	    
//	    for (int i = 0; i < output.length; i++) {
//	        output[i] = arr[i * 2];
//	    }
//	    System.out.println(Arrays.toString(output));
//	    return output;
//	  }
	
//	//-------------METHOD 3 - INT STREAM -----------
//	public static Object[] removeEveryOther(Object[] arr) {
//		System.out.println(Arrays.toString(IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray()));
//		return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();
//    }
	
	
	
	
	//-------------MAIN METHOD -----------
	public static void main(String[] args) {
		removeEveryOther(new Object[]{"Hello"});
		removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"});
		removeEveryOther(new Object[]{});
//		Object[] nullRemoval = null;
//		removeEveryOther(new Object[]{null});
		removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again", "Goodbye again", "Why are you still here?"});
	}
}
