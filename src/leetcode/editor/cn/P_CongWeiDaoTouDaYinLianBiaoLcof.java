//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 442 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 *
 * @author hongxiaobin
 * @date 2023-07-29 21:45:15
 */
public class P_CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        ArrayList<Integer> tmp = new ArrayList<>();

        /**
         * 递归
         *
         * @param head
         * @return
         */
        public int[] reversePrint(ListNode head) {
            recur(head);
            int[] res = new int[tmp.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = tmp.get(i);
            }
            return res;
        }

        void recur(ListNode head) {
            if (head == null) {
                return;
            }
            // 先继续往下遍历，然后再加入到结果中，实现反转
            recur(head.next);
            tmp.add(head.val);
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
