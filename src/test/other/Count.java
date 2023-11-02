package test.other;

import java.util.Arrays;

/**
 * @Author hongxiaobin
 * @Time 2023/2/23-22:20
 */
public class Count {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int result = -1;
        while (right < nums.length) {
            while (nums[right] == nums[left]) {
                right++;
                if (right == nums.length) {
                    break;
                }
            }
            result = right - left;
            if (result > nums.length / 2) {
                return nums[left];
            }
            left = right;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
