package test.other;

/**
 * @Author hongxiaobin
 * @Time 2023/2/25-11:26
 */
public class MaxWater {
    public static int maxArea(int[] height) {
        //    短板向内移动可能变大
        //    长板向内移动一定变小
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left <= right) {
            int n = Math.min(height[left], height[right]) * (right - left);
            if (n >= max) {
                max = n;
            }
            if (height[left] <= height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(ints));
    }
}
