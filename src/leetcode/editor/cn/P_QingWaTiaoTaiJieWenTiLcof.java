//一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 示例 1： 
//
// 输入：n = 2
//输出：2
// 
//
// 示例 2： 
//
// 输入：n = 7
//输出：21
// 
//
// 示例 3： 
//
// 输入：n = 0
//输出：1 
//
// 提示： 
//
// 
// 0 <= n <= 100 
// 
//
// 注意：本题与主站 70 题相同：https://leetcode-cn.com/problems/climbing-stairs/ 
//
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 404 👎 0


package leetcode.editor.cn;

/**
 * 青蛙跳台阶问题
 *
 * @author hongxiaobin
 * @date 2023-07-29 21:59:15
 */
public class P_QingWaTiaoTaiJieWenTiLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_QingWaTiaoTaiJieWenTiLcof().new Solution();
        System.out.println(solution.numWays(7));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         * 1、青蛙跳上一个台阶，等于前一个台阶的跳法加上前两个台阶的跳法之和
         * 2、f(n) = f(n-1) + f(n-2)
         * 3、f(0) = 1  f(1) = 1  f(2) = 2
         *
         * @param n
         * @return
         */
        public int numWays(int n) {
            int a = 1;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int num = (a + b) % 1000000007;
                // 替换
                a = b;
                b = num;
            }
            return b;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
