//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 314 👎 0


package leetcode.editor.cn;

/**
 * 反转字符串中的元音字母
 *
 * @author hongxiaobin
 * @date 2023-07-25 11:02:22
 */
public class P345_ReverseVowelsOfAString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P345_ReverseVowelsOfAString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                while (left < chars.length && !isVowel(chars[left])) {
                    ++left;
                }
                while (right > 0 && !isVowel(chars[right])) {
                    --right;
                }
                if (left < right) {
                    swap(chars, left, right);
                    ++left;
                    --right;
                }
            }
            return new String(chars);
        }

        public boolean isVowel(char ch) {
            return "aeiouAEIOU".indexOf(ch) >= 0;
        }

        public void swap(char[] arr, int left, int right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
