/**
 * Created by Eakon on 2017/7/25.
 */
public class _64_MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int rowIndex=grid.length-1;
        int colIndex=grid[0].length-1;
        for(int i=rowIndex; i>=0; i--){
            for(int j=colIndex; j>=0; j--){
                if(i==rowIndex&&j==colIndex) continue;
                else if(i!=rowIndex&&j!=colIndex) grid[i][j]+=Math.min(grid[i+1][j],grid[i][j+1]);
                else if(i==rowIndex) grid[i][j]+=grid[i][j+1];
                else if(j==colIndex) grid[i][j]+=grid[i+1][j];
            }
        }
        return grid[0][0];
    }
}