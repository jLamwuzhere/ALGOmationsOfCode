package array_TargetSum;

import java.util.ArrayList;
import java.util.List;

public class TargetSumArray {

    public static List<int[]> findCombinations(int[][] given) {
    	int sum = 5;
    	int start = 0;
    	List<int[]> combos = new ArrayList<>();
    	List<int[]> answer = new ArrayList<>();
    	while (sum >= start) {
            combos.add(new int[]{start, sum});
            sum--;
            start++;
        }

    	for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < combos.size(); j++) {
                if (combos.get(j)[0] == given[i][0] && combos.get(j)[1] == given[i][1]) {
                    answer.add(given[i]);
                }
            }
        }
        return answer;
    }
    
    
	// --------------MAIN METHOD--------------
    public static void main(String[] args) {
        int[][] given = {
            {1, 4},
            {2, 3},
            {3, 2},
            {4, 1}
        };
        TargetSumArray targetSumArray = new TargetSumArray();
        List<int[]> result = findCombinations(given);
        System.out.println("Combinations with sum >= target:");
        for (int[] combination : result) {
            System.out.println("[" + combination[0] + ", " + combination[1] + "]");
        }
    }
}
