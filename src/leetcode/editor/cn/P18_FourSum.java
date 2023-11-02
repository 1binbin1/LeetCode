//给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[
//b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）： 
//
// 
// 0 <= a, b, c, d < n 
// a、b、c 和 d 互不相同 
// nums[a] + nums[b] + nums[c] + nums[d] == target 
// 
//
// 你可以按 任意顺序 返回答案 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,0,-1,0,-2,2], target = 0
//输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,2,2,2], target = 8
//输出：[[2,2,2,2]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 200 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 双指针 排序 👍 1672 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 *
 * @author hongxiaobin
 * @date 2023-07-16 11:11:49
 */
public class P18_FourSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P18_FourSum().new Solution();
        solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 双指针法
         * 先排序,然后双层for确定i和j位置的元素,然后移动right和left使得满足条件
         *
         * @param nums
         * @param target
         * @return
         */
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            // 排序
            Arrays.sort(nums);
            // 固定k
            for (int k = 0; k < nums.length; k++) {
                // 去重
                if (k > 0 && nums[k] == nums[k - 1]) {
                    continue;
                }
                // 固定i
                for (int i = k + 1; i < nums.length; i++) {
                    // 去重,k之前的不需要判断,已经在k中判断
                    if (i > k + 1 && nums[i] == nums[i - 1]) {
                        continue;
                    }
                    // 双指针
                    int left = i + 1;
                    int right = nums.length - 1;
                    while (right > left) {
                        if ((long)nums[k] + nums[i] -target >  - (nums[left] + nums[right])) {
                            right--;
                        } else if ((long)nums[k] + nums[i] -target<  - (nums[left] + nums[right])) {
                            left++;
                        } else {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(nums[k]);
                            list.add(nums[i]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            result.add(list);
                            // 第一个找到后去重
                            while (right > left && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            while (right > left && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            // 找到答案后,双指针同时收缩
                            right--;
                            left++;
                        }
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
