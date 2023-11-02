//写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。 
//
// 
//
// 示例: 
//
// 输入: a = 1, b = 1
//输出: 2 
//
// 
//
// 提示： 
//
// 
// a, b 均可能是负数或 0 
// 结果不会溢出 32 位整数 
// 
//
// Related Topics 位运算 数学 👍 439 👎 0


package leetcode.editor.cn;

/**
 * 不用加减乘除做加法
 *
 * @author hongxiaobin
 * @date 2023-08-05 15:14:39
 */
public class P_BuYongJiaJianChengChuZuoJiaFaLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_BuYongJiaJianChengChuZuoJiaFaLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int add(int a, int b) {
            while (b != 0) {
                int carry = (a & b) << 1;
                a = a ^ b;
                b = carry;
            }
            return a;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
