//数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。 
//
// 每当爬上一个阶梯都要花费对应的体力值，一旦支付了相应的体力值，就可以选择向上爬一个阶梯或者爬两个阶梯。 
//
// 请找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。 
//
// 
//
// 示例 1： 
//
// 
//输入：cost = [10, 15, 20]
//输出：15
//解释：最低花费是从 cost[1] 开始，然后走两步即可到阶梯顶，一共花费 15 。
// 
//
// 示例 2： 
//
// 
//输入：cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//输出：6
//解释：最低花费方式是从 cost[0] 开始，逐个经过那些 1 ，跳过 cost[3] ，一共花费 6 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= cost.length <= 1000 
// 0 <= cost[i] <= 999 
// 
//
// 
//
// 
// 注意：本题与主站 746 题相同： https://leetcode-cn.com/problems/min-cost-climbing-stairs/ 
//
//
// Related Topics 数组 动态规划 👍 79 👎 0


package leetcode.editor.cn;

/**
 * 爬楼梯的最少成本
 *
 * @author hongxiaobin
 * @date 2023-07-30 09:38:52
 */
public class P_GzCJIP {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_GzCJIP().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         * 1、dp[i]的含义，第i个台阶所花费的最小体力
         * 2、dp[i] = min{dp[i-1],dp[i-2]} +cost[i]
         *
         * @param cost
         * @return
         */
        public int minCostClimbingStairs(int[] cost) {
            int dp0 = cost[0];
            int dp1 = cost[1];
            for (int i = 2; i < cost.length; i++) {
                int dp2 = Math.min(dp1, dp0) + cost[i];
                // 交换
                dp0 = dp1;
                dp1 = dp2;
            }
            return Math.min(dp0, dp1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
