//给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,5,11,5]
//输出：true
//解释：数组可以分割成 [1, 5, 5] 和 [11] 。 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,5]
//输出：false
//解释：数组不能分割成两个元素和相等的子集。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 200 
// 1 <= nums[i] <= 100 
// 
//
// Related Topics 数组 动态规划 👍 1826 👎 0


package leetcode.editor.cn;

/**
 * 分割等和子集
 *
 * @author hongxiaobin
 * @date 2023-07-29 16:13:06
 */
public class P416_PartitionEqualSubsetSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P416_PartitionEqualSubsetSum().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 0-1背包问题
         * 1、递推公式：dp[j] = max{dp[j],dp[j-weight[i]]+value[i]}
         * 2、外层遍历物品（正序），内层遍历背包（倒序）
         *
         * @param nums
         * @return
         */
        public boolean canPartition(int[] nums) {
            int sum = 0;

            // 从dp[i] 中的i表示背包内元素的总和
            int[] dp = new int[10001];
            for (int num : nums) {
                sum += num;
            }

            if (sum % 2 == 1) {
                return false;
            }

            // 目标和
            int target = sum / 2;

            // 0-1背包逻辑
            for (int i = 0; i < nums.length; i++) {
                // 每个元素一定不能重复放入背包中，因此使用倒序的方式
                for (int j = target; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }

            return dp[target] == target;
        }
    }
//leetcode submit regionend(Prohibit modification and deletion)

}
