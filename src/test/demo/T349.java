package test.demo;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author hongxiaobin
 * @Time 2023/4/18 0018-17:25:24
 */
public class T349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        boolean b = nums1.length <= nums2.length;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] != nums2[j]) {
                if (b) {
                    j++;
                } else {
                    i++;
                }
            } else {
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        for (int i : intersection(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
