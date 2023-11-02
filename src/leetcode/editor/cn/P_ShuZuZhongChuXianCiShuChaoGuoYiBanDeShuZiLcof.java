//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
//
// 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//输出: 2 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/ 
//
// 
//
// Related Topics 数组 哈希表 分治 计数 排序 👍 385 👎 0


package leetcode.editor.cn;

import java.util.Random;

/**
 * 数组中出现次数超过一半的数字
 *
 * @author hongxiaobin
 * @date 2023-07-29 23:25:34
 */
public class P_ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private int randRange(Random rand, int min, int max) {
            return rand.nextInt(max - min) + min;
        }

        private int countOccurences(int[] nums, int num) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    count++;
                }
            }
            return count;
        }

        /**
         * 随机寻找
         *
         * @param nums
         * @return
         */
        public int majorityElement(int[] nums) {
            Random rand = new Random();
            int majorityCount = nums.length / 2;
            while (true) {
                int candidate = nums[randRange(rand, 0, nums.length)];
                if (countOccurences(nums, candidate) > majorityCount) {
                    return candidate;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
