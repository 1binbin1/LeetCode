//给你一个正整数 num ，请你将它分割成两个非负整数 num1 和 num2 ，满足： 
//
// 
// num1 和 num2 直接连起来，得到 num 各数位的一个排列。 
// 
//
// 
// 换句话说，num1 和 num2 中所有数字出现的次数之和等于 num 中所有数字出现的次数。 
// 
// 
// num1 和 num2 可以包含前导 0 。 
//
//
// 请你返回 num1 和 num2 可以得到的和的 最小 值。 
//
// 注意： 
//
// 
// num 保证没有前导 0 。 
// num1 和 num2 中数位顺序可以与 num 中数位顺序不同。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 4325
//输出：59
//解释：我们可以将 4325 分割成 num1 = 24 和 num2 = 35 ，和为 59 ，59 是最小和。
// 
//
// 示例 2： 
//
// 
//输入：num = 687
//输出：75
//解释：我们可以将 687 分割成 num1 = 68 和 num2 = 7 ，和为最优值 75 。
// 
//
// 
//
// 提示： 
//
// 
// 10 <= num <= 10⁹ 
// 
//
// Related Topics 贪心 数学 排序 👍 13 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 最小和分割
 *
 * @author hongxiaobin
 * @date 2023-07-19 16:36:38
 */
public class P2578_SplitWithMinimumSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2578_SplitWithMinimumSum().new Solution();
        solution.splitNum(4325);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 排序+奇偶分组
         * 把小的排在高位更优，大的排在低位更优。
         *
         * @param num
         * @return
         */
        public int splitNum(int num) {
            char[] chars = Integer.toString(num).toCharArray();
            Arrays.sort(chars);
            int[] a = new int[2];
            for (int i = 0; i < chars.length; i++) {
                // 奇偶分组
                a[i % 2] = a[i % 2] * 10 + chars[i] - '0';
            }
            return a[0] + a[1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
