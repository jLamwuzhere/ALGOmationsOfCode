package listArray_MaxAndMin;


											//TARGET GOAL:
//Given an array, find the min and max values and return them..
//EXAMPLE [1,2,3,-1] will return 3 and -1.


public class FindMaxAndMinValues {
  //  METHOD TO GET MIN VALUE OF AN ARRAY
  public static int min(int[] list) {
      int min = list[0];
      for (int i=0; i<list.length; i++){
//	      Check to see if the current number is less than the min
        if(list[i] >= min){
//	        if not, do nothing
          continue;
        }
//	      Otherwise
        else{
//	      current is min
          min = list[i];
        }
      }
      System.out.println("Min: " + min);
      return min;
  }  
  //  METHOD TO GET MAX VALUE OF AN ARRAY
  public static int max(int[] list) {
    int max = list[0];
    for (int i=0; i<list.length; i++){
//	      Check to see if the current number is more than the max
    if(list[i] <= max){
//	        if not, do nothing
      continue;
    }
//	      Otherwise
    else{
//	        current is max
          max = list[i];
        }
      }
    System.out.println("Max: " + max);
    return max;
	  }
	  
	  //MAIN METHOD
	  public static void main(String[] args) {
		min(new int[]{-52, 56, 30, 29, -54, 0, -110});
		max(new int[]{-52, 56, 30, 29, -54, 0, -110});
	    min(new int[]{42, 54, 65, 87, 0});
	    max(new int[]{42, 54, 65, 87, 0});
		min(new int[]{4,6,2,1,9,63,-134,566});
		max(new int[]{4,6,2,1,9,63,-134,566});
		min(new int[]{5});
		max(new int[]{5});
  }
}

