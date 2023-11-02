//给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现
//次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
//
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 982 👎 0


package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两个数组的交集 II
 *
 * @author hongxiaobin
 * @date 2023-07-11 21:24:54
 */
public class P350_IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P350_IntersectionOfTwoArraysIi().new Solution();
        solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 数组交集
         * 1、首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数，
         * 2、然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数。
         *
         * @param nums1 数组1
         * @param nums2 数组2
         * @return 交集
         */
        public int[] intersect(int[] nums1, int[] nums2) {
            // 保证第一个数组长度总小于第二个数组
            if (nums1.length > nums2.length) {
                return intersect(nums2, nums1);
            }
            Map<Integer, Integer> map = new HashMap<>(nums1.length);
            // 统计nums1中每个元素的次数
            for (int num : nums1) {
                // getOrDefault() 方法获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值。
                int count = map.getOrDefault(num, 0) + 1;
                map.put(num, count);
            }
            int[] result = new int[nums1.length];
            int index = 0;
            // 判断nums2是否在哈希表中
            for (int num : nums2) {
                Integer count = map.getOrDefault(num, 0);
                if (count > 0) {
                    result[index++] = num;
                    // 统计过的次数减一，避免重复检验
                    count--;
                    if (count > 0) {
                        map.put(num, count);
                    } else {
                        map.remove(num);
                    }
                }
            }
            return Arrays.copyOfRange(result,0,index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
