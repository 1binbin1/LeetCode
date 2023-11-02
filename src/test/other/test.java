package test.other;

import javax.sound.midi.MidiDevice;

/**
 * @Author hongxiaobin
 * @Time 2023/2/20-11:44
 */
public class test {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left < right && (right - left) != 1) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle;
            }
            if (nums[middle] > target) {
                right = middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2));
    }
}
