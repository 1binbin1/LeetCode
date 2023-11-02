//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。 
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// nums 中的所有元素 互不相同 
// 
//
// Related Topics 位运算 数组 回溯 👍 2088 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 *
 * @author hongxiaobin
 * @date 2023-07-20 10:56:48
 */
public class P78_Subsets {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P78_Subsets().new Solution();
        solution.subsets(new int[]{1, 2});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 我们用 1 表示「在子集中」，0 表示不在子集中，那么每一个子集可以对应一个长度为 n 的 0/1 序列，
         * 第 i 位表示 ai是否在子集中
         * 如{5,2,9}的一个子集{2,9}即表示为011对应的十进制为3
         * 可以发现可以发现 0/1 序列对应的二进制数正好从 0 到 2^n-1
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> subsets(int[] nums) {
            List<Integer> t = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            int k = (1 << nums.length) - 1;
            for (int i = 0; i <= k; i++) {
                String s = Integer.toBinaryString(i);
                StringBuilder stringBuilder = new StringBuilder();
                if (s.length() < nums.length) {
                    for (int j = 0; j < nums.length - s.length(); j++) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(s);
                    s = stringBuilder.toString();
                }
                t.clear();
                if (!s.contains("1")) {
                    ans.add(new ArrayList<>(t));
                    continue;
                }
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        t.add(nums[j]);
                    }
                }
                ans.add(new ArrayList<>(t));
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
