package leetcode.greedy;

/**
 * @ClassName CanPlaceFlowers
 * @Description 种花问题 https://leetcode-cn.com/problems/can-place-flowers/
 * @Author changxuan
 * @Date 2021/1/1 下午10:17
 **/
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 一共可以种下的数量
        int count = 0;
        for (int i = 0; i < flowerbed.length-1; ++i) {
            if (i == 0) {
                if (flowerbed[i+1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else {
                if (flowerbed[i] == 0&& flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            count++;
        }
        if (flowerbed.length != 1 && flowerbed[flowerbed.length-2] == 0 && flowerbed[flowerbed.length-1] == 0){
            count++;
        }
        return count >= n;
    }
}
