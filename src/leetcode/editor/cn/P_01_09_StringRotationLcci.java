//字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。 
//
// 示例1: 
//
//  输入：s1 = "waterbottle", s2 = "erbottlewat"
// 输出：True
// 
//
// 示例2: 
//
//  输入：s1 = "aa", s2 = "aba"
// 输出：False
// 
//
// 
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 100000]范围内。 
// 
//
// 说明: 
//
// 
// 你能只调用一次检查子串的方法吗？ 
// 
//
// Related Topics 字符串 字符串匹配 👍 237 👎 0


package leetcode.editor.cn;

/**
 * 字符串轮转
 *
 * @author hongxiaobin
 * @date 2023-07-17 16:34:36
 */
public class P_01_09_StringRotationLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_01_09_StringRotationLcci().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 思维：
         * 1、两个s2对接为ss
         * 2、若ss包含s1那么则为true
         *
         * @param s1
         * @param s2
         * @return
         */
        public boolean isFlipedString(String s1, String s2) {
            return s1.length() == s2.length() && (s2+s2).contains(s1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
