//给你一个 数字 字符串数组 nums 和一个 数字 字符串 target ，请你返回 nums[i] + nums[j] （两个字符串连接）结果等于 
//target 的下标 (i, j) （需满足 i != j）的数目。 
//
// 
//
// 示例 1： 
//
// 输入：nums = ["777","7","77","77"], target = "7777"
//输出：4
//解释：符合要求的下标对包括：
//- (0, 1)："777" + "7"
//- (1, 0)："7" + "777"
//- (2, 3)："77" + "77"
//- (3, 2)："77" + "77"
// 
//
// 示例 2： 
//
// 输入：nums = ["123","4","12","34"], target = "1234"
//输出：2
//解释：符合要求的下标对包括
//- (0, 1)："123" + "4"
//- (2, 3)："12" + "34"
// 
//
// 示例 3： 
//
// 输入：nums = ["1","1","1"], target = "11"
//输出：6
//解释：符合要求的下标对包括
//- (0, 1)："1" + "1"
//- (1, 0)："1" + "1"
//- (0, 2)："1" + "1"
//- (2, 0)："1" + "1"
//- (1, 2)："1" + "1"
//- (2, 1)："1" + "1"
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// 1 <= nums[i].length <= 100 
// 2 <= target.length <= 100 
// nums[i] 和 target 只包含数字。 
// nums[i] 和 target 不含有任何前导 0 。 
// 
//
// Related Topics 数组 字符串 👍 19 👎 0


package leetcode.editor.cn;

/**
 * 连接后等于目标字符串的字符串对
 *
 * @author hongxiaobin
 * @date 2023-07-20 09:32:20
 */
public class P2023_NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2023_NumberOfPairsOfStringsWithConcatenationEqualToTarget().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numOfPairs(String[] nums, String target) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int i1 = 0; i1 < nums.length; i1++) {
                    if (i != i1 && (nums[i] + nums[i1]).equals(target)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
