//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
//
// Related Topics 数组 数学 👍 304 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 打印从1到最大的n位数
 *
 * @author hongxiaobin
 * @date 2023-07-29 22:25:28
 */
public class P_DaYinCong1daoZuiDaDeNweiShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
        System.out.println(Arrays.toString(solution.printNumbers(10)));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] printNumbers(int n) {
            // 总个数与位数的关系
            // 1-9   2-99   3-999
            int total = (int) (Math.pow(10, n) - 1);
            int[] ints = new int[total];
            for (int i = 1; i <= total; i++) {
                ints[i - 1] = i;
            }
            return ints;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
