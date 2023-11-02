//给定一个正整数 n ，将其拆分为 k 个 正整数 的和（ k >= 2 ），并使这些整数的乘积最大化。 
//
// 返回 你可以获得的最大乘积 。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1。 
//
// 示例 2: 
//
// 
//输入: n = 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。 
//
// 
//
// 提示: 
//
// 
// 2 <= n <= 58 
// 
//
// Related Topics 数学 动态规划 👍 1237 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 整数拆分
 *
 * @author hongxiaobin
 * @date 2023-07-27 16:27:02
 */
public class P343_IntegerBreak {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P343_IntegerBreak().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         * 1、dp[i] 表示拆分i，可以得到的最大乘积
         * 2、递归公式：dp[i] = max({dp[i],(i-j)*j,dp[i-j]*j})
         *
         * @param n
         * @return
         */
        public int integerBreak(int n) {
            int[] dp = new int[n + 1];
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j < i - 1; j++) {
                    int max1 = Math.max(dp[i], (i - j) * j);
                    int max2 = Math.max((i - j) * j, dp[i - j] * j);
                    dp[i] = Math.max(max1, max2);
                }
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
