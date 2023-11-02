//给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。 
//
// 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。 
//
// 请不要使用除法，且在 O(n) 时间复杂度内完成此题。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4]
//输出: [24,12,8,6]
// 
//
// 示例 2: 
//
// 
//输入: nums = [-1,1,0,-3,3]
//输出: [0,0,9,0,0]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁵ 
// -30 <= nums[i] <= 30 
// 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内 
// 
//
// 
//
// 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。） 
//
// Related Topics 数组 前缀和 👍 1503 👎 0


package leetcode.editor.cn;

/**
 * 除自身以外数组的乘积
 *
 * @author hongxiaobin
 * @date 2023-07-20 14:59:56
 */
public class P238_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P238_ProductOfArrayExceptSelf().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 左右乘积数组
         * 1、初始化两个空数组L和R，对于给定索引i，L[i]代表的是i左侧所有数字的乘积，R[i]代表的是i右侧所有数字的乘积
         * 2、我们只需要用两个循环来填充L和R数组的值
         * 3、i处的值等于L[i] * R[i]
         *
         * @param nums
         * @return
         */
        public int[] productExceptSelf(int[] nums) {
            int length = nums.length;

            int[] L = new int[length];
            int[] R = new int[length];

            int[] ans = new int[length];

            L[0] = 1;
            for (int i = 1; i < length; i++) {
                L[i] = nums[i - 1] * L[i - 1];
            }
            R[length - 1] = 1;
            for (int i = length - 2; i >= 0; i--) {
                R[i] = nums[i + 1] * R[i + 1];
            }
            for (int i = 0; i < length; i++) {
                ans[i] = L[i] * R[i];
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
