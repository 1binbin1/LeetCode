//给你一个 正 整数 n 。 
//
// 用 even 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的偶数下标的个数。 
//
// 用 odd 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的奇数下标的个数。 
//
// 返回整数数组 answer ，其中 answer = [even, odd] 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 17
//输出：[2,0]
//解释：17 的二进制形式是 10001 。 
//下标 0 和 下标 4 对应的值为 1 。 
//共有 2 个偶数下标，0 个奇数下标。
// 
//
// 示例 2： 
//
// 输入：n = 2
//输出：[0,1]
//解释：2 的二进制形式是 10 。 
//下标 1 对应的值为 1 。 
//共有 0 个偶数下标，1 个奇数下标。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics 位运算 👍 6 👎 0


package leetcode.editor.cn;

/**
 * 奇偶位数
 *
 * @author hongxiaobin
 * @date 2023-07-19 16:55:14
 */
public class P2595_NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2595_NumberOfEvenAndOddBits().new Solution();
        solution.evenOddBit(2);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] evenOddBit(int n) {
            String binaryString = Integer.toBinaryString(n);
            int[] res = new int[2];
            int length = binaryString.length();
            for (int i = 0; i < length; i++) {
                res[i % 2] = res[i % 2] + (binaryString.charAt(length - 1 - i) - '0');
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
