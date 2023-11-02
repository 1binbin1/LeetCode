//求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。 
//
// 
//
// 示例 1： 
//
// 输入: n = 3
//输出: 6
// 
//
// 示例 2： 
//
// 输入: n = 9
//输出: 45
// 
//
// 
//
// 限制： 
//
// 
// 1 <= n <= 10000 
// 
//
// Related Topics 位运算 递归 脑筋急转弯 👍 628 👎 0


package leetcode.editor.cn;

/**
 * 求1+2+…+n
 *
 * @author hongxiaobin
 * @date 2023-08-05 15:33:59
 */
public class P_Qiu12nLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_Qiu12nLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int sumNums(int n) {
            boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
            return n;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
