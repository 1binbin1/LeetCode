//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// Related Topics 链表 双指针 👍 2585 👎 0


package leetcode.editor.cn;

/**
 * 删除链表的倒数第 N 个结点
 *
 * @author hongxiaobin
 * @date 2023-07-15 22:04:59
 */
public class P19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        /**
         * 1、定义fast和slow双指针
         * 2、fast先移动n+1步
         * 3、fast和slow同时移动，直到fast到尾部，那么slow指向的就是要删除的前一个元素
         * 4、进行删除
         *
         * @param head
         * @param n
         * @return
         */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // 构造虚拟头节点，便于操作
            ListNode tmpHead = new ListNode(0);
            tmpHead.next = head;
            // fast和slow指向虚拟头节点
            ListNode fast = tmpHead;
            ListNode slow = tmpHead;
            while (n-- > 0 && fast != null) {
                fast = fast.next;
            }
            // 再移动一步
            assert fast != null;
            fast = fast.next;
            // 同时移动
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            // 删除
            slow.next = slow.next.next;
            return tmpHead.next;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
