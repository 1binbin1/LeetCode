//假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。 
//
// 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[
//i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。 
//
// 示例 1: 
//
// 
//输入: g = [1,2,3], s = [1,1]
//输出: 1
//解释: 
//你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
//虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
//所以你应该输出1。
// 
//
// 示例 2: 
//
// 
//输入: g = [1,2], s = [1,2,3]
//输出: 2
//解释: 
//你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
//你拥有的饼干数量和尺寸都足以让所有孩子满足。
//所以你应该输出2.
// 
//
// 
//
// 提示： 
//
// 
// 1 <= g.length <= 3 * 10⁴ 
// 0 <= s.length <= 3 * 10⁴ 
// 1 <= g[i], s[j] <= 2³¹ - 1 
// 
//
// Related Topics 贪心 数组 双指针 排序 👍 742 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author hongxiaobin
 * @date 2023-07-26 10:07:51
 */
public class P455_AssignCookies {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P455_AssignCookies().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 贪心算法
         * 1、大尺寸的饼干既可以满足胃口大的孩子，也可以满足胃口小的孩子，那么就应该先满足胃口大的孩子
         * 2、这里的局部最优解就是大饼干给胃口大的孩子
         * 3、全局最优就是尽可能喂给多的孩子
         * 4、尝试贪心算法：两个数组进行排序，从最大（后）往前进行遍历孩子数组，用大饼干去满足胃口大的孩子，并统计满足孩子的个数
         *
         * @param g
         * @param s
         * @return
         */
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int index = s.length - 1;
            int result = 0;
            // 从后往前遍历孩子数组
            for (int i = g.length - 1; i >= 0; i--) {
                if (index >= 0 && s[index] >= g[i]) {
                    result++;
                    index--;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
