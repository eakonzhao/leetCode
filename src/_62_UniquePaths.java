/**
 * Created by Eakon on 2017/7/30.
 */
public class _62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        grid[m-1][n-1]=1;
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1&&j==n-1) continue;
                else if(i!=m-1&&j!=n-1) grid[i][j]=grid[i+1][j]+grid[i][j+1];
                else if(i==m-1)grid[i][j]=grid[i][j+1];
                else if(j==n-1) grid[i][j]=grid[i+1][j];
            }
        }
        return grid[0][0];
    }
}
