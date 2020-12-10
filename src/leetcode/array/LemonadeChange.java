package leetcode.array;

/**
 * @ClassName LemonadeChange
 * @Description 柠檬水找零 https://leetcode-cn.com/problems/lemonade-change/
 * @Author changxuan
 * @Date 2020/12/10 下午8:58
 **/
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveNum++;
            } else if (bills[i] == 10) {
                fiveNum--;
                tenNum++;
            } else if (tenNum > 0) {
                tenNum--;
                fiveNum--;
            } else {
                fiveNum -= 3;
            }
            if (fiveNum < 0) {
                return false;
            }
        }
        return true;
    }
}
