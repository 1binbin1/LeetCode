package test.other;

/**
 * @Author hongxiaobin
 * @Time 2023/2/24-16:07
 */
public class Shuangzhizhen {
    public static int peakIndexInMountainArray(int[] arr) {
        //    双指针找最大值
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            for (right = left; right < arr.length; right++) {
                if (arr[right] > arr[left]) {
                    left = right;
                    break;
                }
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(ints));
    }
}
