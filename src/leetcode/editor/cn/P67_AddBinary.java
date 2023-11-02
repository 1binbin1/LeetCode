//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
//
// Related Topics 位运算 数学 字符串 模拟 👍 1049 👎 0


package leetcode.editor.cn;

import jdk.nashorn.internal.ir.IfNode;

/**
 * 二进制求和
 *
 * @author hongxiaobin
 * @date 2023-07-11 20:55:15
 */
public class P67_AddBinary {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P67_AddBinary().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 二进制求和
         * 思路：
         * 1、位运算
         * 2、把 a 和 b 转换成整型数字 x 和 y，在接下来的过程中，x 保存结果，y 保存进位。
         *    当进位不为 0 时
         *    计算当前 x 和 y 的无进位相加结果：answer = x ^ y
         *    计算当前 x 和 y 的进位：carry = (x & y) << 1
         *    完成本次循环，更新 x = answer，y = carry
         *    返回 x 的二进制形式
         * @param a 二进制1
         * @param b 二进制2
         * @return 和
         */
        public String addBinary(String a, String b) {
            StringBuilder stringBuilder = new StringBuilder();
            int x = Integer.parseInt(a, 2);
            int y = Integer.parseInt(b, 2);
            while (y!=0){
                int answer = x ^ y;
                int carry = (x & y) << 1;
                x = answer;
                y = carry;
            }
            return Integer.toBinaryString(x);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
