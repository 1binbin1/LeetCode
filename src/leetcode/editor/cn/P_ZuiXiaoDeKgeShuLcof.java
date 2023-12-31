//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
//
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 575 👎 0


package leetcode.editor.cn;

import java.util.PriorityQueue;

/**
 * 最小的k个数
 *
 * @author hongxiaobin
 * @date 2023-07-29 23:04:24
 */
public class P_ZuiXiaoDeKgeShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ZuiXiaoDeKgeShuLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 维护大顶堆前n个数
         *
         * @param arr
         * @param k
         * @return
         */
        public int[] getLeastNumbers(int[] arr, int k) {
            int[] res = new int[k];
            if (k == 0) {
                return res;
            }
            // 优先队列
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for (int i = 0; i < k; i++) {
                queue.offer(arr[i]);
            }
            for (int i = k; i < arr.length; ++i) {
                if (queue.peek() > arr[i]) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
            for (int i = 0; i < k; ++i) {
                res[i] = queue.poll();
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
