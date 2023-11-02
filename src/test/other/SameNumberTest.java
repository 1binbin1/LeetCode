package test.other;

/**
 * @Author hongxiaobin
 * @Time 2023/2/20-9:26
 */
public class SameNumberTest {
    public static int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        while (left < right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                ints[i] = nums[right] * nums[right];
                i--;
                right--;
                continue;
            }
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ints[i] = nums[left] * nums[left];
                i--;
                left++;
                continue;
            }
            if (Math.abs(nums[left]) == Math.abs(nums[right])) {
                ints[i] = nums[left] * nums[left];
                ints[i - 1] = nums[right] * nums[right];
                i -= 2;
                left++;
                right--;
                continue;
            }
        }
        ints[0] = nums[left] * nums[left];
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {-4, -1, 0, 3, 10};
        int[] ints1 = sortedSquares(ints);
        for (int j : ints1) {
            System.out.print(j + "   ");
        }
    }
}
