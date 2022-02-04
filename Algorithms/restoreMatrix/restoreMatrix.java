package restoreMatrix;

public class restoreMatrix {

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {

        int length = rowSum.length;
        int height = colSum.length;

        int res[][] = new int[length][height];
        for(int i = 0 ; i < length;i++)
        {
            for(int j = 0;j < height;j++)
            {
                res[i][j] = Math.min(rowSum[i],colSum[j]);
                rowSum[i] = rowSum[i] - res[i][j];
                colSum[j] = colSum[j] - res[i][j];
            }
        }

        return res;
    }

}
