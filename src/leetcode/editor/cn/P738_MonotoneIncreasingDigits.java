//当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。 
//
// 给定一个整数 n ，返回 小于或等于 n 的最大数字，且数字呈 单调递增 。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = 10
//输出: 9
// 
//
// 示例 2: 
//
// 
//输入: n = 1234
//输出: 1234
// 
//
// 示例 3: 
//
// 
//输入: n = 332
//输出: 299
// 
//
// 
//
// 提示: 
//
// 
// 0 <= n <= 10⁹ 
// 
//
// Related Topics 贪心 数学 👍 395 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 单调递增的数字
 *
 * @author hongxiaobin
 * @date 2023-07-26 16:54:56
 */
public class P738_MonotoneIncreasingDigits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P738_MonotoneIncreasingDigits().new Solution();
        solution.monotoneIncreasingDigits(332);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 前一位比后一位大就减掉1,然后将其他全部变为9
         *
         * @param n
         * @return
         */
        public int monotoneIncreasingDigits(int n) {
            String str = Integer.toString(n);
            char[] s = str.toCharArray();
            // 标记赋值9从哪里开始
            int flag = s.length;
            for (int i = s.length - 1; i > 0; i--) {
                if (s[i - 1] > s[i]) {
                    flag = i;
                    s[i - 1] -= 1;
                }
            }
            for (int i = flag; i < s.length; i++) {
                s[i] = '9';
            }
            return Integer.parseInt(new String(s));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
