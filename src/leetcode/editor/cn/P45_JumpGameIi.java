//给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。 
//
// 每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处: 
//
// 
// 0 <= j <= nums[i] 
// i + j < n 
// 
//
// 返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [2,3,1,1,4]
//输出: 2
//解释: 跳到最后一个位置的最小跳跃数是 2。
//     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
// 
//
// 示例 2: 
//
// 
//输入: nums = [2,3,0,1,4]
//输出: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// 0 <= nums[i] <= 1000 
// 题目保证可以到达 nums[n-1] 
// 
//
// Related Topics 贪心 数组 动态规划 👍 2179 👎 0


package leetcode.editor.cn;

/**
 * 跳跃游戏 II
 *
 * @author hongxiaobin
 * @date 2023-07-26 11:46:48
 */
public class P45_JumpGameIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P45_JumpGameIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 1、如果当前覆盖的最远距离的下标不是集合终点，那么步数加一，还需要继续移动
         * 2、如果当前覆盖的最远距离的下标就是集合终点，那么步数不用加一，因为不需要移动了
         *
         * @param nums
         * @return
         */
        public int jump(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            // 当前覆盖的最远距离的下标
            int curDistance = 0;
            // 记录已经走的步数
            int ans = 0;
            // 下一步覆盖的最远距离的下标
            int nextDistance = 0;
            for (int i = 0; i < nums.length; i++) {
                // 更新下一步覆盖的最远距离
                nextDistance = Math.max(nums[i] + i, nextDistance);
                // 遇到当前覆盖的最远距离
                if (i == curDistance) {
                    // 如果当前覆盖的最远距离的下标不是终点
                    if (curDistance != nums.length - 1) {
                        // 需要下一步
                        ans++;
                        // 更新当前覆盖的最远距离的下标
                        curDistance = nextDistance;
                        // 下一步的覆盖范围已经包含终点，结束循环
                        if (nextDistance >= nums.length - 1) {
                            break;
                        }
                    }else {
                        break;
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
