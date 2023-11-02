//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例 1: 
//
// 
//输入：s = "abaccdeff"
//输出：'b'
// 
//
// 示例 2: 
//
// 
//输入：s = "" 
//输出：' '
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
//
// Related Topics 队列 哈希表 字符串 计数 👍 340 👎 0


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 *
 * @author hongxiaobin
 * @date 2023-08-06 21:24:29
 */
public class P_DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        System.out.println(solution.firstUniqChar("abaccdeff"));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1) {
                    return s.charAt(i);
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
