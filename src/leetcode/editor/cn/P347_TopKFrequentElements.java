//给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
// 
//
// 示例 2: 
//
// 
//输入: nums = [1], k = 1
//输出: [1] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// k 的取值范围是 [1, 数组中不相同的元素的个数] 
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的 
// 
//
// 
//
// 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。 
//
// Related Topics 数组 哈希表 分治 桶排序 计数 快速选择 排序 堆（优先队列） 👍 1610 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 前 K 个高频元素
 *
 * @author hongxiaobin
 * @date 2023-07-17 20:25:36
 */
public class P347_TopKFrequentElements {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P347_TopKFrequentElements().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            int[] ints = new int[k];
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            // 按照value排序
            ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
            for (int i = 0; i < k; i++) {
                ints[i] = list.get(i).getKey();
            }
            return ints;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
