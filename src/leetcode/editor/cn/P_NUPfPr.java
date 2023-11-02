//给定一个非空的正整数数组 nums ，请判断能否将这些数字分成元素和相等的两部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,5,11,5]
//输出：true
//解释：nums 可以分割成 [1, 5, 5] 和 [11] 。 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,5]
//输出：false
//解释：nums 不可以分为和相等的两部分
// 
//
// 
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
// 
//
// 
// 注意：本题与主站 416 题相同： https://leetcode-cn.com/problems/partition-equal-subset-
//sum/ 
//
// Related Topics 数学 字符串 模拟 👍 86 👎 0


package leetcode.editor.cn;

/**
 * 分割等和子集
 *
 * @author hongxiaobin
 * @date 2023-07-30 09:32:00
 */
public class P_NUPfPr {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_NUPfPr().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 0-1背包问题
         * 1、递推公式 dp[j] = max{dp[j],dp[j-weight[i]]+value[i]}
         * 2、外层遍历（物品）正序，内层遍历（背包）倒序
         *
         * @param nums
         * @return
         */
        public boolean canPartition(int[] nums) {
            int[] dp = new int[10001];
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (sum % 2 == 1) {
                return false;
            }

            // 背包大小
            int target = sum / 2;
            for (int i = 0; i < nums.length; i++) {
                for (int j = target; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }
            return dp[target] == target;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
