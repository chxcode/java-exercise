package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PondSizes
 * @Description
 * @Author changxuan
 * @Date 2020/12/2 下午9:31
 **/
public class PondSizes {
    public int[] pondSizes(int[][] land) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for(int i = 0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==0){
                    temp = dfs(land,i,j);
                    list.add(temp);
                }
            }
        }
        list.sort((o1,o2)-> o1-o2);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private int dfs(int [][]land,int i,int j){
        if(i<0||j<0||i>=land.length||j>=land[0].length||land[i][j]!=0)  return 0;
        land[i][j] = 3;
        int area = 1;
        area += dfs(land,i-1,j-1);
        area += dfs(land,i-1,j+1);
        area += dfs(land,i,j+1);
        area += dfs(land,i,j-1);
        area += dfs(land,i-1,j);
        area += dfs(land,i+1,j);
        area += dfs(land,i+1,j-1);
        area += dfs(land,i+1,j+1);
        return area;
    }
}
