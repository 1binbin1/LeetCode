//给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。 
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
// 
//
// 
// 注意：本题与主站 78 题相同： https://leetcode-cn.com/problems/subsets/ 
//
// Related Topics 位运算 数组 回溯 👍 74 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有子集
 *
 * @author hongxiaobin
 * @date 2023-08-02 22:29:37
 */
public class P_TVdhkn {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_TVdhkn().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 位运算
         * {1,2,3}
         * 0-000 1-001 2-010 3-011 4-100 5-101 6-110 7-111
         * 1表示显示，0表示不显示
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int k = (1 << nums.length) - 1;
            for (int i = 0; i <= k; i++) {
                String s = Integer.toBinaryString(i);
                // 补充0
                StringBuilder stringBuilder = new StringBuilder();
                if (s.length() < nums.length) {
                    for (int j = 0; j < nums.length - s.length(); j++) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(s);
                    s = stringBuilder.toString();
                }
                ArrayList<Integer> list = new ArrayList<>();
                if (!s.contains("1")) {
                    res.add(list);
                    continue;
                }
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        list.add(nums[j]);
                    }
                }
                res.add(list);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
