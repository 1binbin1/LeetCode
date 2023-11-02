//给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
// 
//
// 示例 2: 
//
// 
//输入：nums = [1,0,1,1,0,1]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] 不是 0 就是 1. 
// 
//
// Related Topics 数组 👍 398 👎 0


package leetcode.editor.cn;

/**
 * 最大连续 1 的个数
 *
 * @author hongxiaobin
 * @date 2023-07-18 15:59:38
 */
public class P485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P485_MaxConsecutiveOnes().new Solution();
        solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0, count = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
            maxCount = Math.max(maxCount, count);
            return maxCount;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
