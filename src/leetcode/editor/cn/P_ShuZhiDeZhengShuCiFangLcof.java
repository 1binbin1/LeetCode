//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xⁿ）。不得使用库函数，同时不需要考虑大数问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 
//
// 示例 2： 
//
// 
//输入：x = 2.10000, n = 3
//输出：9.26100 
//
// 示例 3： 
//
// 
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2⁻² = 1/2² = 1/4 = 0.25 
//
// 
//
// 提示： 
//
// 
// -100.0 < x < 100.0 
// -2³¹ <= n <= 2³¹-1 
// n 是一个整数 
// 要么 x 不为零，要么 n > 0 。 
// -10⁴ <= xⁿ <= 10⁴ 
// 
//
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
//
// Related Topics 递归 数学 👍 425 👎 0


package leetcode.editor.cn;

/**
 * 数值的整数次方
 *
 * @author hongxiaobin
 * @date 2023-08-02 22:18:56
 */
public class P_ShuZhiDeZhengShuCiFangLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ShuZhiDeZhengShuCiFangLcof().new Solution();
        System.out.println(solution.myPow(2.0, -2));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 快速幂+递归
         *
         * @param x
         * @param n
         * @return
         */
        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }

        private double quickMul(double x, long N) {
            if (N == 0) {
                return 1.0;
            }
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
