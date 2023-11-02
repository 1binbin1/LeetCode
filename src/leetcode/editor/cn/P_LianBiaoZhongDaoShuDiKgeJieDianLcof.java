//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
//
// Related Topics 链表 双指针 👍 477 👎 0


package leetcode.editor.cn;

/**
 * 链表中倒数第k个节点
 *
 * @author hongxiaobin
 * @date 2023-07-29 22:59:04
 */
public class P_LianBiaoZhongDaoShuDiKgeJieDianLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
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
        /**
         * 双指针
         * 1、前指针先走k步，后指针不动，此时两个节点节点的距离为k
         * 2、同时移动两个指针，当前指针到尾部，后指针指向第k个
         *
         * @param head
         * @param k
         * @return
         */
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode former = head;
            ListNode latter = head;
            for (int i = 0; i < k; i++) {
                former = former.next;
            }
            while (former != null) {
                latter = latter.next;
                former = former.next;
            }
            return latter;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
