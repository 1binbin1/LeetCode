//把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。 
//
// 
//
// 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
// 
//
// 示例 2: 
//
// 输入: 2
//输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0
//.05556,0.02778] 
//
// 
//
// 限制： 
//
// 1 <= n <= 11 
//
// Related Topics 数学 动态规划 概率与统计 👍 568 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * n个骰子的点数
 *
 * @author hongxiaobin
 * @date 2023-08-07 23:03:14
 */
public class P_NgeTouZiDeDianShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_NgeTouZiDeDianShuLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         * 1、设n个骰子的解（概率列表）为f(n)，其中和为x的概率为f(n,x)
         * 2、f(n,x) = (求和)f(n-1,x-i)*1/6
         * 3、由f(n-1)推出f(n)
         * 4、也就是说n-1的概率写入到n中对应的6个，然后求总和
         *
         * @param n
         * @return
         */
        public double[] dicesProbability(int n) {
            double[] dp = new double[6];
            Arrays.fill(dp, 1.0 / 6.0);
            for (int i = 2; i <= n; i++) {
                double[] tmp = new double[5 * i + 1];
                for (int j = 0; j < dp.length; j++) {
                    for (int k = 0; k < 6; k++) {
                        tmp[j + k] += dp[j] / 6.0;
                    }
                }
                dp = tmp;
            }
            return dp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
