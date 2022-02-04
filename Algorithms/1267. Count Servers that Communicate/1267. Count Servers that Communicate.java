package 1267. Count Servers that Communicate;

public class 1267. Count Servers that Communicate {
	public int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if (row == 1 && col == 1)
            return 0;
        int [] rowArray = new int [row];
        int [] colArray = new int [col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == 1) {
                    rowArray[i] += 1;
                    colArray[j] += 1;
                }
            }
        }
        int connectedServers = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == 1 && (rowArray[i] > 1 || colArray[j] > 1))
                    connectedServers += 1;
            }
        }
        return connectedServers;
    }
}
