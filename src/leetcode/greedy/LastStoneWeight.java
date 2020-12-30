package leetcode.greedy;

import java.util.Arrays;

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
}
