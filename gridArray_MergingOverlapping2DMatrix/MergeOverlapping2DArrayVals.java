package gridArray_MergingOverlapping2DMatrix;

public class MergeOverlapping2DArrayVals {
	
	    // Build out each array list
	    // Compare values in arrays.
	    // if values are similar, loop through and find where they connect.
	    // append the new values to that array.
	    // return the new arrays.
//	    1,2,3
//	    2,3,4,5,6
//	    8,9,10
//	    15,16,17,18
    public static int[][] merge(int[][] intervals) {
    	for(i=0; i<intervals.length; i++) {
    		intervals[i] = new int[] {
    				for (j = intervals[0]; j <= intervals[1]; j++) {
    					intervals[i].push([j]);
    				}
    		}
    	}
//    	if 
     }
    
    
//	--------------MAIN METHOD--------------
	public static void main(String[] args) {
		merge(new int[][] {{1,2,3},{4,5,6},{7,8}});
		merge(new int[][] {{1,2,3},{2,3,4,5,6},{8,9,10},{15,16,17,18}});
	}
	
	
}
