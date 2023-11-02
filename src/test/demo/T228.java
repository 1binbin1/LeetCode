package test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hongxiaobin
 * @Time 2023/4/18 0018-11:07:24
 */
public class T228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int left = 0, right = 0;
        while (left <= right && right < nums.length) {
            if (nums[right] - nums[left] != 1) {
                if (right - left == 1) {
                    result.add(String.valueOf(nums[left]));
                } else {
                    result.add(nums[left] + "->" + nums[right - 1]);
                }
                left = right;
            }
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 9};
        System.out.println(summaryRanges(nums));
    }
}
