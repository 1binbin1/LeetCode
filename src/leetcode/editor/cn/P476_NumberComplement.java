//对整数的二进制表示取反（0 变 1 ，1 变 0）后，再转换为十进制表示，可以得到这个整数的补数。 
//
// 
// 例如，整数 5 的二进制表示是 "101" ，取反后得到 "010" ，再转回十进制表示得到补数 2 。 
// 
//
// 给你一个整数 num ，输出它的补数。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：num = 5
//输出：2
//解释：5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
// 
//
// 示例 2： 
//
// 
//输入：num = 1
//输出：0
//解释：1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num < 2³¹ 
// 
//
// 
//
// 注意：本题与 1009 https://leetcode-cn.com/problems/complement-of-base-10-integer/ 相
//同 
//
// Related Topics 位运算 👍 341 👎 0


package leetcode.editor.cn;

/**
 * 数字的补数
 *
 * @author hongxiaobin
 * @date 2023-07-18 15:40:07
 */
public class P476_NumberComplement {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P476_NumberComplement().new Solution();
        System.out.println(solution.findComplement(5));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findComplement(int num) {
            // 转为二进制
            String binaryString = Integer.toBinaryString(num);
            // 取反
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < binaryString.length(); i++) {
                stringBuilder.append('0' == binaryString.charAt(i) ? 1 : 0);
            }
            // 转为十进制
            return Integer.parseInt(stringBuilder.toString(), 2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
