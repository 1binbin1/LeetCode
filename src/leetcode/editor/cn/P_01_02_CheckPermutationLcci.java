//给定两个由小写字母组成的字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 
//输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 
//输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
//
// Related Topics 哈希表 字符串 排序 👍 160 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 判定是否互为字符重排
 *
 * @author hongxiaobin
 * @date 2023-07-17 14:19:53
 */
public class P_01_02_CheckPermutationLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_01_02_CheckPermutationLcci().new Solution();
        solution.CheckPermutation("abc", "bad");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 转为数组，排序，然后一一验证
         *
         * @param s1
         * @param s2
         * @return
         */
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
