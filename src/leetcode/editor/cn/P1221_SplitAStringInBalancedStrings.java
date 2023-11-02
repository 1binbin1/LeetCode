//平衡字符串 中，'L' 和 'R' 字符的数量是相同的。 
//
// 给你一个平衡字符串 s，请你将它分割成尽可能多的子字符串，并满足： 
//
// 
// 每个子字符串都是平衡字符串。 
// 
//
// 返回可以通过分割得到的平衡字符串的 最大数量 。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "RLRRLLRLRL"
//输出：4
//解释：s 可以分割为 "RL"、"RRLL"、"RL"、"RL" ，每个子字符串中都包含相同数量的 'L' 和 'R' 。
// 
//
// 示例 2： 
//
// 
//输入：s = "RLRRRLLRLL"
//输出：2
//解释：s 可以分割为 "RL"、"RRRLLRLL"，每个子字符串中都包含相同数量的 'L' 和 'R' 。
//注意，s 无法分割为 "RL"、"RR"、"RL"、"LR"、"LL" 因为第 2 个和第 5 个子字符串不是平衡字符串。 
//
// 示例 3： 
//
// 
//输入：s = "LLLLRRRR"
//输出：1
//解释：s 只能保持原样 "LLLLRRRR" 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= s.length <= 1000 
// s[i] = 'L' 或 'R' 
// s 是一个 平衡 字符串 
// 
//
// Related Topics 贪心 字符串 计数 👍 229 👎 0


package leetcode.editor.cn;

/**
 * 分割平衡字符串
 *
 * @author hongxiaobin
 * @date 2023-07-26 11:06:30
 */
public class P1221_SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1221_SplitAStringInBalancedStrings().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 贪心
         * 1、对于一个平衡字符串s，若s能从中间某处分割左右两个子串，若其中一个是平衡字符串，那么另一个必然也是
         * 2、为了最大化分割数量，可以不断循环，每次s中分割出一个 最短 的平衡前缀，剩余的继续以最小单位分割
         * @param s
         * @return
         */
        public int balancedStringSplit(String s) {
			int ans = 0;
            // 不同的数量
            int d = 0;
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (ch == 'L'){
                    ++d;
                }else {
                    --d;
                }
                if (d==0){
                    ++ans;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
