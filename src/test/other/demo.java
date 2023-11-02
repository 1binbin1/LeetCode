package test.other;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author hongxiaobin
 * @Time 2023/2/23-19:56
 */
public class demo {
    public static int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            hashMap.put(i, 0);
        }
        for (int num : nums) {
            hashMap.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> next : hashMap.entrySet()) {
            if (next.getValue() == 0) {
                return next.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
