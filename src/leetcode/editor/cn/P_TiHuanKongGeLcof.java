//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
//
// Related Topics 字符串 👍 515 👎 0


package leetcode.editor.cn;

/**
 * 替换空格
 *
 * @author hongxiaobin
 * @date 2023-07-29 16:42:46
 */
public class P_TiHuanKongGeLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_TiHuanKongGeLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 直接替换
         *
         * @param s
         * @return
         */
        public String replaceSpace(String s) {
            return s.replaceAll(" ", "%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
