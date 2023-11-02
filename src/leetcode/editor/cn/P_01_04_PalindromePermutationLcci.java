//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
//
// Related Topics 位运算 哈希表 字符串 👍 114 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 回文排列
 *
 * @author hongxiaobin
 * @date 2023-07-17 14:48:04
 */
public class P_01_04_PalindromePermutationLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_01_04_PalindromePermutationLcci().new Solution();
        solution.canPermutePalindrome("tactcoae");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 字符串中最多只能有一个字母是单数
         *
         * @param s
         * @return
         */
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            // 单个数出现的次数
            int count = 0;
            for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
                if (characterIntegerEntry.getValue() % 2 != 0) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
