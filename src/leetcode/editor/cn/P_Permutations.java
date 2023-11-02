//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
//
// Related Topics 数组 回溯 👍 2623 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 全排列
 *
 * @author hongxiaobin
 * @date 2023-08-01 11:25:32
 */
public class P_Permutations {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_Permutations().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            ArrayList<List<Integer>> res = new ArrayList<>();
            ArrayList<Integer> output = new ArrayList<>();
            for (int num : nums) {
                output.add(num);
            }
            int n = nums.length;
            backtrack(n, output, res, 0);
            return res;
        }

        private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
            // 所有数都填完了
            if (first == n) {
                res.add(new ArrayList<>(output));
            }
            for (int i = first; i < n; i++) {
                Collections.swap(output, first, i);
                backtrack(n, output, res, first + 1);
                Collections.swap(output, first, i);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
