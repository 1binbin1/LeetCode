//给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。 
//
// 回文字符串 是正着读和倒过来读一样的字符串。 
//
// 子字符串 是字符串中的由连续字符组成的一个序列。 
//
// 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abc"
//输出：3
//解释：三个回文子串: "a", "b", "c"
// 
//
// 示例 2： 
//
// 
//输入：s = "aaa"
//输出：6
//解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由小写英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 1207 👎 0


package leetcode.editor.cn;

/**
 * 回文子串
 *
 * @author hongxiaobin
 * @date 2023-08-01 14:25:08
 */
public class P_PalindromicSubstrings {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_PalindromicSubstrings().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 动态规划
     * 1、dp[i][j] 表示字符串s在[i,j] 区间的子串是否是一个回文串
     * 2、当s[i] == s[j] && (j-i<2 || dp[i+1][j-1]) 时，dp[i][j] = true，否则为false
     */
    class Solution {
        public int countSubstrings(String s) {
            boolean[][] dp = new boolean[s.length()][s.length()];
            int ans = 0;
            for (int j = 0; j < s.length(); j++) {
                for (int i = 0; i <= j; i++) {
                    if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                        dp[i][j] = true;
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
