//给定两个字符串 s 和 t ，判断它们是否是同构的。 
//
// 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。 
//
// 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。 
//
// 
//
// 示例 1: 
//
// 
//输入：s = "egg", t = "add"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "foo", t = "bar"
//输出：false 
//
// 示例 3： 
//
// 
//输入：s = "paper", t = "title"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// t.length == s.length 
// s 和 t 由任意有效的 ASCII 字符组成 
// 
//
// Related Topics 哈希表 字符串 👍 620 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 *
 * @author hongxiaobin
 * @date 2023-07-12 11:30:13
 */
public class P205_IsomorphicStrings {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P205_IsomorphicStrings().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 同构字符串
         * 思路：哈希表
         * 1、按照字母出现的顺序，把两个字符串都映射到另一个集合中。
         *
         * @param s 字符串1
         * @param t 字符串2
         * @return 是否为同构字符串
         */
        public boolean isIsomorphic(String s, String t) {
            return isIsomorphicHelper(s).equals(isIsomorphicHelper(t));
        }

        private String isIsomorphicHelper(String s) {
            int n = s.length();
            int[] ints = new int[128];
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (ints[c]==0){
                    ints[c] = count;
                    count++;
                }
                sb.append(ints[c]);
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
