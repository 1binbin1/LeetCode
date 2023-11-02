//字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没
//有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。 
//
// 示例1: 
//
// 
// 输入："aabcccccaaa"
// 输出："a2b1c5a3"
// 
//
// 示例2: 
//
// 
// 输入："abbccd"
// 输出："abbccd"
// 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 50000]范围内。 
// 
//
// Related Topics 双指针 字符串 👍 167 👎 0


package leetcode.editor.cn;

import com.sun.corba.se.spi.orbutil.fsm.FSM;

/**
 * 字符串压缩
 *
 * @author hongxiaobin
 * @date 2023-07-17 16:12:21
 */
public class P_01_06_CompressStringLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_01_06_CompressStringLcci().new Solution();
        solution.compressString("aabcccccaaa");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String compressString(String S) {
            int slow = 0; // j
            int fast = 0; // i
            StringBuilder stringBuilder = new StringBuilder();
            while (fast < S.length()) {
                while (slow < S.length() && S.charAt(fast) == S.charAt(slow)) {
                    slow++;
                }
                stringBuilder.append(S.charAt(fast)).append(slow - fast);
                fast = slow;
            }
            return stringBuilder.length() >= S.length() ? S : stringBuilder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
