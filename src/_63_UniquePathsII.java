/**
 * Created by Eakon on 2017/7/30.
 */
public class _63_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowIndex=obstacleGrid.length-1;
        int colIndex=obstacleGrid[0].length-1;
        for(int i=rowIndex; i>=0; i--){
            for(int j=colIndex; j>=0; j--){
                if(obstacleGrid[i][j]!=1){
                    if(i==rowIndex&&j==colIndex) obstacleGrid[i][j]=1;
                    else if(i!=rowIndex&&j!=colIndex) {
                        obstacleGrid[i][j]=obstacleGrid[i+1][j]+obstacleGrid[i][j+1];
                    }else if(i==rowIndex) obstacleGrid[i][j]=obstacleGrid[i][j+1];
                    else if(j==colIndex) obstacleGrid[i][j]=obstacleGrid[i+1][j];
                }else{
                    obstacleGrid[i][j]=0;
                }
            }
        }
        return obstacleGrid[0][0];
    }
}
