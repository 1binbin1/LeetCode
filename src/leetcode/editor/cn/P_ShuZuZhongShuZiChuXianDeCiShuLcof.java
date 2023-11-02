//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums.length <= 10000 
// 
//
// 
//
// Related Topics 位运算 数组 👍 851 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 数组中数字出现的次数
 *
 * @author hongxiaobin
 * @date 2023-08-08 23:31:21
 */
public class P_ShuZuZhongShuZiChuXianDeCiShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        solution.singleNumbers(new int[]{4, 1, 4, 6});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] singleNumbers(int[] nums) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int num : nums) {
                if (arrayList.contains(num)) {
                    arrayList.remove((Integer) num);
                } else {
                    arrayList.add(num);
                }
            }
            return new int[]{arrayList.get(0), arrayList.get(1)};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
