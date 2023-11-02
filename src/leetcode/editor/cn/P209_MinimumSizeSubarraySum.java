//给定一个含有 n 个正整数的数组和一个正整数 target 。 
//
// 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长
//度。如果不存在符合条件的子数组，返回 0 。 
//
// 
//
// 示例 1： 
//
// 
//输入：target = 7, nums = [2,3,1,2,4,3]
//输出：2
//解释：子数组 [4,3] 是该条件下的长度最小的子数组。
// 
//
// 示例 2： 
//
// 
//输入：target = 4, nums = [1,4,4]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= target <= 10⁹ 
// 1 <= nums.length <= 10⁵ 
// 1 <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。 
// 
//
// Related Topics 数组 二分查找 前缀和 滑动窗口 👍 1760 👎 0


package leetcode.editor.cn;

/**
 * 长度最小的子数组
 *
 * @author hongxiaobin
 * @date 2023-07-15 20:47:11
 */
public class P209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P209_MinimumSizeSubarraySum().new Solution();
        solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 长度最小的连续子数组
         * 思路：
         * 1、滑动窗口
         * 2、控制起始位置和结束位置，只要和大于target就改变起始位置直到小于target
         * 3、当结束位置到数组终点即停止
         *
         * @param target
         * @param nums
         * @return
         */
        public int minSubArrayLen(int target, int[] nums) {
            int result = Integer.MAX_VALUE;
            // 滑动窗口的数值之和
            int sum = 0;
            // 滑动窗口的起始位置
            int i = 0;
            // 滑动窗口的长度
            int subLength;
            // j是结束位置
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                // 每次更新i并计算和，只要大于等于target的就缩小窗口大小
                while (sum >= target) {
                    subLength = j - i + 1;
                    result = Math.min(result, subLength);
                    // 不断变更i（起始位置）
                    sum -= nums[i++];
                }
            }
            return result == Integer.MAX_VALUE ? 0 : result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
