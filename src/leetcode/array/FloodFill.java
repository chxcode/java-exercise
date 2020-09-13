package leetcode.array;

/**
 * @ClassName FloodFill
 * @Description 图像渲染 https://leetcode-cn.com/problems/flood-fill/
 * @Author changxuan
 * @Date 2020/8/16 下午7:39
 **/
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originColor = image[sr][sc];
        // 如果颜色相同则不处理
        if (originColor != newColor) {
            dfs(image, sr, sc, newColor, originColor);
        }
        return image;
    }

    public void dfs(int[][] image, int x, int y, int newColor, int originColor) {
        // 判断是否超出边界
        if (x < 0 || x >= image.length || y < 0 || y >=image[0].length) {
            return;
        }
        if (image[x][y] == originColor) {
            // 将颜色替换
            image[x][y] = newColor;
            // 深度优先搜索四周的像素点
            dfs(image, x-1, y, newColor, originColor);
            dfs(image, x+1, y, newColor, originColor);
            dfs(image, x, y-1, newColor, originColor);
            dfs(image, x, y+1, newColor, originColor);
        }
        return;
    }
}
