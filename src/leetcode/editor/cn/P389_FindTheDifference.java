//给定两个字符串 s 和 t ，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abcd", t = "abcde"
//输出："e"
//解释：'e' 是那个被添加的字母。
// 
//
// 示例 2： 
//
// 
//输入：s = "", t = "y"
//输出："y"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s 和 t 只包含小写字母 
// 
//
// Related Topics 位运算 哈希表 字符串 排序 👍 413 👎 0


package leetcode.editor.cn;

/**
 * 找不同
 *
 * @author hongxiaobin
 * @date 2023-07-25 14:29:26
 */
public class P389_FindTheDifference {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P389_FindTheDifference().new Solution();
        solution.findTheDifference("abcd", "abcde");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {
            int[] cnt = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                cnt[ch - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                cnt[ch - 'a']--;
                if (cnt[ch - 'a'] < 0) {
                    return ch;
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
