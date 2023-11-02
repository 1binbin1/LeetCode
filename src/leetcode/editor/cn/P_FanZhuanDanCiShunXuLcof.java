//输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
//则输出"student. a am I"。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 注意：本题与主站 151 题相同：https://leetcode-cn.com/problems/reverse-words-in-a-string/ 
//
//
// 注意：此题对比原题有改动 
//
// Related Topics 双指针 字符串 👍 307 👎 0


package leetcode.editor.cn;

/**
 * 翻转单词顺序
 *
 * @author hongxiaobin
 * @date 2023-08-05 22:52:10
 */
public class P_FanZhuanDanCiShunXuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_FanZhuanDanCiShunXuLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 1、删除多余的空格
         * 2、全部反转
         * 3、单词再反转（以空格为间隔）
         *
         * @param s
         * @return
         */
        public String reverseWords(String s) {
            StringBuilder sb = trimSpaces(s); // 翻转字符串
            reverse(sb, 0, sb.length() - 1); // 翻转每个单词
            reverseEachWord(sb);
            return sb.toString();
        }

        public StringBuilder trimSpaces(String s) {
            int left = 0, right = s.length() - 1; // 去掉字符串开头的空白字符
            while (left <= right && s.charAt(left) == ' ') {
                ++left;
            } // 去掉字符串末尾的空白字符
            while (left <= right && s.charAt(right) == ' ') {
                --right;
            } // 将字符串间多余的空白字符去除
            StringBuilder sb = new StringBuilder();
            while (left <= right) {
                char c = s.charAt(left);
                if (c != ' ') {
                    sb.append(c);
                } else if (sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(c);
                }
                ++left;
            }
            return sb;
        }

        public void reverse(StringBuilder sb, int left, int right) {
            while (left < right) {
                char tmp = sb.charAt(left);
                sb.setCharAt(left++, sb.charAt(right));
                sb.setCharAt(right--, tmp);
            }
        }

        public void reverseEachWord(StringBuilder sb) {
            int n = sb.length();
            int start = 0, end = 0;
            while (start < n) { // 循环至单词的末尾
                while (end < n && sb.charAt(end) != ' ') {
                    ++end;
                } // 翻转单词
                reverse(sb, start, end - 1); // 更新start，去找下一个单词
                start = end + 1;
                ++end;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
