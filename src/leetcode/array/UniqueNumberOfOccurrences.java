package leetcode.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: ChangXuan
 * @Decription: 独一无二的出现次数 https://leetcode-cn.com/problems/unique-number-of-occurrences/
 * @Date: 17:41 2020/10/28
 **/
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> contains = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
//            if (contains.get(arr[i]) == null) {
//                contains.put(arr[i], 0);
//            }else {
//                contains.put(arr[i],  contains.get(arr[i])+1);
//            }
            contains.put(arr[i], contains.get(arr[i]) == null ? 0 : contains.get(arr[i])+1);
        }
        HashSet<Integer> result = new HashSet(arr.length);
        for (int item : contains.keySet()) {
            if (result.contains(contains.get(item)))
                return false;
            else
                result.add(contains.get(item));
        }
        return true;
    }
}
