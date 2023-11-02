//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 
//输入: s = "abc"
//输出: true
// 
//
// 限制： 
//
// 
// 0 <= len(s) <= 100 
// s[i]仅包含小写字母 
// 如果你不使用额外的数据结构，会很加分。 
// 
//
// Related Topics 位运算 哈希表 字符串 排序 👍 297 👎 0


package leetcode.editor.cn;

/**
 * 判定字符是否唯一
 *
 * @author hongxiaobin
 * @date 2023-07-17 14:06:46
 */
public class P01_01_IsUniqueLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P01_01_IsUniqueLcci().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 每遍历一个字符就要判断后面是否还有相同的字符，如果有，说明有重复的，直接返回false
         *
         * @param astr
         * @return
         */
        public boolean isUnique(String astr) {
            for (int i = 0; i < astr.length(); i++) {
                char c = astr.charAt(i);
                if (astr.indexOf(c, i + 1) != -1) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
