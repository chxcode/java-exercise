package leetcode.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName LastStoneWeight
 * @Description 最后一块石头的重量
 * https://leetcode-cn.com/problems/last-stone-weight/
 * @Author changxuan
 * @Date 2020/12/30 下午8:31
 **/
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        Arrays.sort(stones);
        int len = stones.length;
        while (stones[len-1] != 0 && stones[len-2] !=0) {
            int last = stones[len-1];
            int prev = stones[len-2];
            if (last == prev) {
                stones[len-1] = 0;
                stones[len-2] = 0;
            }
            if (prev < last) {
                stones[len-1] -= stones[len-2];
                stones[len-2] = 0;
            }
            Arrays.sort(stones);
        }
        return stones[len-1];
    }

    // 改进空间 利用最大堆的性质 以减少排序操作
    public int lastStoneWeightPro(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

}
