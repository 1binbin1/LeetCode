//对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。 
//
// 给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 28
//输出：true
//解释：28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, 和 14 是 28 的所有正因子。 
//
// 示例 2： 
//
// 
//输入：num = 7
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10⁸ 
// 
//
// Related Topics 数学 👍 192 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 完美数
 *
 * @author hongxiaobin
 * @date 2023-07-18 16:15:31
 */
public class P507_PerfectNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P507_PerfectNumber().new Solution();
        solution.checkPerfectNumber(28);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 答案只有五个 6, 28, 496, 8128, 33550336
         *
         * @param num
         * @return
         */
        public boolean checkPerfectNumber(int num) {
            return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
