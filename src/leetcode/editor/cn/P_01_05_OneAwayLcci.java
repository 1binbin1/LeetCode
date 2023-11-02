//字符串有三种编辑操作:插入一个英文字符、删除一个英文字符或者替换一个英文字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。 
//
// 
//
// 示例 1: 
//
// 
//输入: 
//first = "pale"
//second = "ple"
//输出: True 
//
// 
//
// 示例 2: 
//
// 
//输入: 
//first = "pales"
//second = "pal"
//输出: False
// 
//
// Related Topics 双指针 字符串 👍 251 👎 0


package leetcode.editor.cn;

/**
 * 一次编辑
 *
 * @author hongxiaobin
 * @date 2023-07-17 15:02:18
 */
public class P_01_05_OneAwayLcci {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_01_05_OneAwayLcci().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 分情况讨论
         *
         * @param first
         * @param second
         * @return
         */
        public boolean oneEditAway(String first, String second) {
            int m = first.length();
            int n = second.length();
            if (n - m == 1) {
                // 一次插入、删除
                return oneInsert(first, second);
            } else if (m - n == 1) {
                // 一次插入、删除
                return oneInsert(second, first);
            } else if (m == n) {
                // 一次修改
                boolean foundDifference = false;
                for (int i = 0; i < m; i++) {
                    if (first.charAt(i) != second.charAt(i)) {
                        if (!foundDifference) {
                            foundDifference = true;
                        } else {
                            return false;
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }

        /**
         * 一次插入
         *
         * @param shorter
         * @param longer
         * @return
         */
        private boolean oneInsert(String shorter, String longer) {
            int length1 = shorter.length();
            int length2 = longer.length();
            int index1 = 0;
            int index2 = 0;
            while (index1 < length1 && index2 < length2) {
                if (shorter.charAt(index1) == longer.charAt(index2)) {
                    index1++;
                }
                index2++;
                if (index2 - index1 > 1) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
