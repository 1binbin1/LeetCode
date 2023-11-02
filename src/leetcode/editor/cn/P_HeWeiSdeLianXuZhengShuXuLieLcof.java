//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
//
// Related Topics 数学 双指针 枚举 👍 562 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 和为s的连续正数序列
 *
 * @author hongxiaobin
 * @date 2023-08-05 23:23:41
 */
public class P_HeWeiSdeLianXuZhengShuXuLieLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        solution.findContinuousSequence(10);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> vec = new ArrayList<int[]>();
            int sum = 0, limit = (target - 1) / 2; // (target - 1) / 2 等效于 target / 2 下取整
            for (int x = 1; x <= limit; ++x) {
                long delta = 1 - 4 * (x - (long) x * x - 2 * target);
                if (delta < 0) {
                    continue;
                }
                int delta_sqrt = (int) Math.sqrt(delta + 0.5);
                if ((long) delta_sqrt * delta_sqrt == delta && (delta_sqrt - 1) % 2 == 0) {
                    int y = (-1 + delta_sqrt) / 2; // 另一个解(-1-delta_sqrt)/2必然小于0，不用考虑
                    if (x < y) {
                        int[] res = new int[y - x + 1];
                        for (int i = x; i <= y; ++i) {
                            res[i - x] = i;
                        }
                        vec.add(res);
                    }
                }
            }
            return vec.toArray(new int[vec.size()][]);
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}
