//给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello"
//输出："hello"
// 
//
// 示例 2： 
//
// 
//输入：s = "here"
//输出："here"
// 
//
// 示例 3： 
//
// 
//输入：s = "LOVELY"
//输出："lovely"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 由 ASCII 字符集中的可打印字符组成 
// 
//
// Related Topics 字符串 👍 231 👎 0


package leetcode.editor.cn;

import java.util.Locale;

/**
 * 转换成小写字母
 *
 * @author hongxiaobin
 * @date 2023-07-19 20:08:58
 */
public class P709_ToLowerCase {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P709_ToLowerCase().new Solution();
        solution.toLowerCase("LOVElY");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * A-Z  65-90
         * a-z  97-122
         *
         * @param s
         * @return
         */
        public String toLowerCase(String s) {
            return s.toLowerCase();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}