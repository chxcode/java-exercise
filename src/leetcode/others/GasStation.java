package leetcode.others;

/**
 * @ClassName GasStation
 * @Description 加油站
 * @Author changxuan
 * @Date 2020/11/18 下午10:06
 **/
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (run(i, gas, cost)) return i;
        }
        return -1;
    }

    public boolean run(int n, int[] gas, int[] cost) {
        int i = 0;
        int capacity = 0;
        int length = gas.length;
        while (i < cost.length) {
            capacity += gas[n%length];
            if (capacity < cost[n]) return false;
            capacity -= cost[n];
            n++;
            i++;
        }
        return true;
    }
}
