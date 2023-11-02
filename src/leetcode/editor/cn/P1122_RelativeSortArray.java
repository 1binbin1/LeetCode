//给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 示例 2: 
//
// 
//输入：arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//输出：[22,28,8,6,17,44]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
//
// Related Topics 数组 哈希表 计数排序 排序 👍 267 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 数组的相对排序
 *
 * @author hongxiaobin
 * @date 2023-07-20 21:07:56
 */
public class P1122_RelativeSortArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1122_RelativeSortArray().new Solution();
        System.out.println(Arrays.toString(solution.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 计数排序
         * 使用一个1001的数组f，记录每一个元素在数据arr1中出现的次数
         * 随后我们遍历数据arr2，当遍历到元素x的时候，将f[x]个x加入到答案，并将f[x]清零
         * 当遍历结束后，所有在arr2中出现过的元素将已经有序
         *
         * @param arr1
         * @param arr2
         * @return
         */
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int upper = 0;
            for (int x : arr1) {
                upper = Math.max(upper, x);
            }
            int[] frequency = new int[upper + 1];
            for (int x : arr1) {
                ++frequency[x];
            }

            int[] ans = new int[arr1.length];
            int index = 0;
            for (int x : arr2) {
                for (int i = 0; i < frequency[x]; ++i) {
                    ans[index++] = x;
                }
                frequency[x] = 0;
            }
            for (int i = 0; i <= upper; i++) {
                for (int j = 0; j < frequency[i]; ++j) {
                    ans[index++] = i;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
