package leetcode.greedy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Dota2Senate
 * @Description Dota2 参议院 https://leetcode-cn.com/problems/dota2-senate/
 * @Author changxuan
 * @Date 2020/12/11 下午9:56
 **/
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll(), direIndex = dire.poll();
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }
}
