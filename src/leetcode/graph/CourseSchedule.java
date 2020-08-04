package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseSchedule
 * @Description 课程表
 * @Author changxuan
 * @Date 2020/8/4 下午8:25
 **/
public class CourseSchedule {

    public static void main(String[] args) {
        int[][] prerequisites = {{1,0}};
        int[][] test = {{1,0},{0,1}};
        int[][] test2 = {{1,0},{0,2},{2,1}};
//        System.out.println(canFinish(2, prerequisites));
//        System.out.println(canFinish(2, test));
        System.out.println(canFinish(3, test2));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        int[] flag = new int[numCourses];
        // 填充边
        for (int i = 0; i < prerequisites.length; i++){
            graph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        for (int i = 0; i < numCourses-1; i++){
            if (flag[i] == 0){
                 return dfs(graph, flag, i);
            }
        }
        return true;
    }
    public static boolean dfs(int[][] graph, int[] flag, int node){
        if (flag[node] == 1)
            return false;
        flag[node] = 1;
        for (int i = 0; i < graph[0].length; i++){
            if (graph[node][i] != 0){
                return dfs(graph, flag, i);
            }
        }
        return true;
    }
    public boolean canFinishRight(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for(int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        int[] flags = new int[numCourses];
        for(int[] cp : prerequisites)
            adjacency.get(cp[1]).add(cp[0]);
        for(int i = 0; i < numCourses; i++)
            if(!dfs(adjacency, flags, i)) return false;
        return true;
    }
    private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {
        if(flags[i] == 1) return false;
        if(flags[i] == -1) return true;
        flags[i] = 1;
        for(Integer j : adjacency.get(i))
            if(!dfs(adjacency, flags, j)) return false;
        flags[i] = -1;
        return true;
    }

}
