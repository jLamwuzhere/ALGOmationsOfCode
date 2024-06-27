package gridArray_maxIslandArea;

public class MaxIslandArea {
	private int islandArea;  // Moved to be a class-level variable
	
    public int maxIslandArea(char[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islandArea = 0;  // Reset islandArea for each new island
                    traverseGrid(grid, i, j);
                    if (islandArea > maxArea) {
                        maxArea = islandArea;
                    }
                }
            }
        }
        return maxArea;
    }

    private void traverseGrid(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        islandArea++;
        traverseGrid(grid, i + 1, j);
        traverseGrid(grid, i - 1, j);
        traverseGrid(grid, i, j + 1);
        traverseGrid(grid, i, j - 1);
    }
    
    
	// --------------MAIN METHOD--------------	
    public static void main(String[] args) {
     char[][] exampleGrid = {
    		    {0,0,1,0,0,0,0,1,0,0,0,0,0},
    		    {0,0,0,0,0,0,0,1,1,1,0,0,0},
    		    {0,1,1,0,1,0,0,0,0,0,0,0,0},
    		    {0,1,0,0,1,1,0,0,1,0,1,0,0},
    		    {0,1,0,0,1,1,0,0,1,1,1,0,0},
    		    {0,0,0,0,0,0,0,0,0,0,1,0,0},
    		    {0,0,0,0,0,0,0,1,1,1,0,0,0},
    		    {0,0,0,0,0,0,0,1,1,0,0,0,0}
     };
        MaxIslandArea maxIslandArea = new MaxIslandArea();
        int result = maxIslandArea.maxIslandArea(exampleGrid);
        System.out.println("Maximum Island Area: " + result);
    }
}
