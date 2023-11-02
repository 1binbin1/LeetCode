//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
//
// Related Topics 字符串 👍 211 👎 0


package leetcode.editor.cn;

/**
 * 字符串中的单词数
 *
 * @author hongxiaobin
 * @date 2023-07-18 15:54:35
 */
public class P434_NumberOfSegmentsInAString {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P434_NumberOfSegmentsInAString().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 直接以空格分开
         *
         * @param s
         * @return
         */
        public int countSegments(String s) {
            return s.split(String.valueOf(' ')).length;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
