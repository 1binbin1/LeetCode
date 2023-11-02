//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
//
// Related Topics 数组 双指针 排序 👍 320 👎 0


package leetcode.editor.cn;

/**
 * 调整数组顺序使奇数位于偶数前面
 *
 * @author hongxiaobin
 * @date 2023-07-29 22:43:10
 */
public class P_DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        solution.exchange(new int[]{1, 2, 3, 4});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 双指针，当前是偶数，那么找到奇数来对换
         *
         * @param nums
         * @return
         */
        public int[] exchange(int[] nums) {
            int slow = 0;
            int fast = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 1) {
                    slow++;
                    fast++;
                } else {
                    for (; fast < nums.length; fast++) {
                        if (nums[fast] % 2 == 1) {
                            // 交换
                            int tmp = nums[slow];
                            nums[slow] = nums[fast];
                            nums[fast] = tmp;
                            // 恢复
                            slow++;
                            fast = slow;
                            break;
                        }
                    }
                }
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
