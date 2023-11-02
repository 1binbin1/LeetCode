//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
//
// Related Topics 哈希表 数学 动态规划 堆（优先队列） 👍 488 👎 0


package leetcode.editor.cn;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * 丑数
 *
 * @author hongxiaobin
 * @date 2023-08-07 23:22:31
 */
public class P_ChouShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ChouShuLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 最小堆
         * 1、每次取出堆顶的元素。则x是堆中最小的丑数，那么2x,3x,5x也是丑数，然后再加入到堆中
         * 2、使用哈希表去重
         *
         * @param n
         * @return
         */
        public int nthUglyNumber(int n) {
            int[] factors = {2, 3, 5};
            HashSet<Long> seen = new HashSet<>();
            // 优先队列
            PriorityQueue<Long> heap = new PriorityQueue<>();
            seen.add(1L);
            heap.offer(1L);
            int ugly = 0;
            for (int i = 0; i < n; i++) {
                // 拿到堆顶元素
                long curr = heap.poll();
                ugly = (int) curr;
                for (int factor : factors) {
                    long next = curr * factor;
                    if (seen.add(next)) {
                        heap.offer(next);
                    }
                }
            }
            return ugly;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
