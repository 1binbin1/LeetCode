//给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
//
// 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。 
//
// 不能使用任何内置的库函数，如 sqrt 。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 16
//输出：true
//解释：返回 true ，因为 4 * 4 = 16 且 4 是一个整数。
// 
//
// 示例 2： 
//
// 
//输入：num = 14
//输出：false
//解释：返回 false ，因为 3.742 * 3.742 = 14 但 3.742 不是一个整数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 2³¹ - 1 
// 
//
// Related Topics 数学 二分查找 👍 511 👎 0


package leetcode.editor.cn;

/**
 * 有效的完全平方数
 *
 * @author hongxiaobin
 * @date 2023-07-19 19:45:49
 */
public class P367_ValidPerfectSquare {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P367_ValidPerfectSquare().new Solution();
        solution.isPerfectSquare(2147483647);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 4=1+3
         * 9=1+3+5
         *
         * @param num
         * @return
         */
        public boolean isPerfectSquare(int num) {
            int count = 1;
            int sum = 1;
            while (true) {
                if (num == sum) {
                    return true;
                }
                if (num < sum){
                    return false;
                }
                count += 2;
                sum += count;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
