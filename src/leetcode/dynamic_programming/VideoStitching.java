package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @Author: ChangXuan
 * @Decription: 视频拼接 https://leetcode-cn.com/problems/video-stitching/
 * @Date: 16:16 2020/10/24
 **/
public class VideoStitching {

    public int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            for (int[] clip : clips) {
                if (clip[0] < i && i <= clip[1]) {
                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE - 1 ? -1 : dp[T];
    }
}
