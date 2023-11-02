//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1434 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 *
 * @author hongxiaobin
 * @date 2023-07-26 09:33:57
 */
public class P77_Combinations {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P77_Combinations().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 首先需要穷举，并且是组合问题，因此需要用到回溯算法
         * 1、如果直接采用暴力算法，那么需要的for循环层数为k，不可取
         * 2、通过回溯可以解决多层for问题
         *
         * @param n
         * @param k
         * @return
         */
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            dfs(n, k, 1);
            return result;
        }

        private void dfs(int n, int k, int cur) {
            // 剪枝
            if (path.size() + (n - cur + 1) < k) {
                return;
            }
            // 记录合法的答案
            if (path.size() == k) {
                result.add(new ArrayList<>(path));
                return;
            }
            // 考虑当前的位置
            path.add(cur);
            dfs(n, k, cur + 1);
            // 考虑不选当前位置
            path.remove(path.size() - 1);
            dfs(n, k, cur + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
