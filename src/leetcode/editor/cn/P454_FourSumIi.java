//给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足： 
//
// 
// 0 <= i, j, k, l < n 
// nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
//输出：2
//解释：
//两个元组如下：
//1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1)
// + 2 = 0
//2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1)
// + 0 = 0
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// n == nums1.length 
// n == nums2.length 
// n == nums3.length 
// n == nums4.length 
// 1 <= n <= 200 
// -2²⁸ <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2²⁸ 
// 
//
// Related Topics 数组 哈希表 👍 843 👎 0


package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 四数相加 II
 *
 * @author hongxiaobin
 * @date 2023-07-16 11:00:08
 */
public class P454_FourSumIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P454_FourSumIi().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            // key:a和b的和
            // value:a和b的和出现的次数
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            // 遍历A和B,统计两个数组元素之和以及出现的次数,并放到hashMap中
            for (int a : nums1) {
                for (int b : nums2) {
                    hashMap.put(a + b, hashMap.getOrDefault(a + b, 0) + 1);
                }
            }

            int count = 0;
            // 遍历C和D,如果0-(c+d) 出现在hashMap中,那么count++
            for (int c : nums3) {
                for (int d : nums4) {
                    if (hashMap.containsKey(-(c + d))) {
                        count += hashMap.get(-(c + d));
                    }
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
