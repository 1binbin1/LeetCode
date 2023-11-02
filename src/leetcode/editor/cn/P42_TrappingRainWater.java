//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//输出：6
//解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
// 
//
// 示例 2： 
//
// 
//输入：height = [4,2,0,3,2,5]
//输出：9
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 1 <= n <= 2 * 10⁴ 
// 0 <= height[i] <= 10⁵ 
// 
//
// Related Topics 栈 数组 双指针 动态规划 单调栈 👍 4461 👎 0


package leetcode.editor.cn;

/**
 * 接雨水
 *
 * @author hongxiaobin
 * @date 2023-07-17 20:40:25
 */
public class P42_TrappingRainWater {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P42_TrappingRainWater().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 按照列来装雨水——使用动态规划
         * 1、每一列能装的高度= min(这一列左侧最高，这一列右侧最高) - 当列高度
         * 2、每一次都在重复计算最大值，因此可以使用两个数组还保存两边的最大值
         * 3、每次只要比较没有计算的部分的最大值和数组中的最大值即可
         *
         * @param height
         * @return
         */
        public int trap(int[] height) {
            if (height.length <= 2) {
                return 0;
            }
            int[] maxLeft = new int[height.length];
            int[] maxRight = new int[height.length];
            int size = maxRight.length;

            // 记录每个柱子左边柱子的最高度
            maxLeft[0] = height[0];
            for (int i = 1; i < size; i++) {
                maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
            }
            // 记录每个柱子右边柱子的最高度
            maxRight[size - 1] = height[size - 1];
            for (int i = size - 2; i >= 0; i--) {
                maxRight[i] = Math.max(height[i], maxRight[i + 1]);
            }

            // 求和
            int sum = 0;
            for (int i = 0; i < size; i++) {
                int count = Math.min(maxLeft[i], maxRight[i]) - height[i];
                if (count > 0) {
                    sum += count;
                }
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
