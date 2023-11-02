//输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。 
//
// 要求时间复杂度为O(n)。 
//
// 
//
// 示例1: 
//
// 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^5 
// -100 <= arr[i] <= 100 
// 
//
// 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/ 
//
// 
//
// Related Topics 数组 分治 动态规划 👍 713 👎 0


package leetcode.editor.cn;

/**
 * 连续子数组的最大和
 *
 * @author hongxiaobin
 * @date 2023-07-29 23:11:42
 */
public class P_LianXuZiShuZuDeZuiDaHeLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_LianXuZiShuZuDeZuiDaHeLcof().new Solution();
        solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 动态规划
         * f(i) = max{f(i-1)+nums[i],nums[i]}
         *
         * @param nums
         * @return
         */
        public int maxSubArray(int[] nums) {
            int pre = 0;
            int maxAns = nums[0];
            for (int num : nums) {
                pre = Math.max(num, pre + num);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
