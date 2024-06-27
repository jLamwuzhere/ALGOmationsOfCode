package array_Sorted_PositionOfElement;

import java.util.Arrays;

//LEETCODE #34: Find First and Last Position of Element in Sorted Array

public class FindThePositionsofAnElement {
	public static int[] searchRange(int[] nums, int target) {
        int[] output = new int[] {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
            	output[0] = i;
            }
            if(i++ != i){
                output[1] = i;
            }
        }
        System.out.println(Arrays.toString(output));
        return output;       
    }
	
	public static void main(String[] args) {
		int nums[]= {1,2,3};
		searchRange(nums, 12);
	}   
}
