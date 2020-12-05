package leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName TaskScheduler
 * @Description 任务调度 https://leetcode-cn.com/problems/task-scheduler/
 * @Author changxuan
 * @Date 2020/12/5 下午7:18
 **/
public class TaskScheduler {
    public static void main(String[] args) {
        System.out.println((int)'A');
    }
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        // 最多的执行次数
        int maxExec = 0;
        for (char ch : tasks) {
            int exec = freq.getOrDefault(ch, 0) + 1;
            freq.put(ch, exec);
            maxExec = Math.max(maxExec, exec);
        }

        // 具有最多执行次数的任务数量
        int maxCount = 0;
        Set<Map.Entry<Character, Integer>> entrySet = freq.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            int value = entry.getValue();
            if (value == maxExec) {
                ++maxCount;
            }
        }

        return Math.max((maxExec - 1) * (n + 1) + maxCount, tasks.length);
    }
}
