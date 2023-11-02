//泰波那契序列 Tn 定义如下： 
//
// T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2 
//
// 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。 
//
// 
//
// 示例 1： 
//
// 输入：n = 4
//输出：4
//解释：
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
// 
//
// 示例 2： 
//
// 输入：n = 25
//输出：1389537
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 37 
// 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。 
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 260 👎 0


package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 第 N 个泰波那契数
 *
 * @author hongxiaobin
 * @date 2023-07-20 21:30:50
 */
public class P1137_NThTribonacciNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1137_NThTribonacciNumber().new Solution();
        System.out.println(solution.tribonacci(25));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int N = 3;
        int[][] mul(int[][] a, int[][] b) {
            int[][] c = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
                }
            }
            return c;
        }
        public int tribonacci(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            int[][] ans = new int[][]{
                    {1,0,0},
                    {0,1,0},
                    {0,0,1}
            };
            int[][] mat = new int[][]{
                    {1,1,1},
                    {1,0,0},
                    {0,1,0}
            };
            int k = n - 2;
            while (k != 0) {
                if ((k & 1) != 0) {
                    ans = mul(ans, mat);
                }
                mat = mul(mat, mat);
                k >>= 1;
            }
            return ans[0][0] + ans[0][1];
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
