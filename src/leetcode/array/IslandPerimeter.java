package leetcode.array;

/**
 * @ClassName IslandPerimeter
 * @Description 岛屿的周长 https://leetcode-cn.com/problems/island-perimeter/
 * @Author changxuan
 * @Date 2020/10/30 下午8:16
 **/
public class IslandPerimeter {


    public int islandPerimeter(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    return visit(grid, r, c);
                }
            }
        }
        return 0;
    }

    public int visit(int[][] grid, int i, int j) {
        if (i<0 || i>grid.length || j<0 || j>=grid[0].length)
            return 1;
        if (grid[i][j] == 0)
            return 1;
        if (grid[i][j] != 1)
            return 0;
        grid[i][j] = 2;
        return  visit(grid, i+1, j) +
                visit(grid, i-1, j) +
                visit(grid, i, j+1)+
                visit(grid, i, j-1);
    }
}
