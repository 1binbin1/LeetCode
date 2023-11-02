//给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 本题中，将空字符串定义为有效的 回文串 。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串 
//
// 示例 2: 
//
// 
//输入: s = "race a car"
//输出: false
//解释："raceacar" 不是回文串 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
//
// 
//
// 
// 注意：本题与主站 125 题相同： https://leetcode-cn.com/problems/valid-palindrome/ 
//
// Related Topics 双指针 字符串 👍 57 👎 0


package leetcode.editor.cn;

/**
 * 有效的回文
 *
 * @author hongxiaobin
 * @date 2023-07-30 11:52:55
 */
public class P_XltzEq {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_XltzEq().new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                // 判断是否为数字或字母
                if (Character.isLetterOrDigit(ch)) {
                    stringBuilder.append(Character.toLowerCase(ch));
                }
            }
            // 利用反转判断回文
            StringBuilder reverse = new StringBuilder(stringBuilder).reverse();
            return reverse.toString().equals(stringBuilder.toString());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
