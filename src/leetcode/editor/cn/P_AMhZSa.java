//给定一个链表的 头节点 head ，请判断其是否为回文链表。 
//
// 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入: head = [1,2,3,3,2,1]
//输出: true 
//
// 示例 2： 
//
// 
//
// 
//输入: head = [1,2]
//输出: false
// 
//
// 
//
// 提示： 
//
// 
// 链表 L 的长度范围为 [1, 10⁵] 
// 0 <= node.val <= 9 
// 
//
// 
//
// 进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
//
// 
//
// 
// 注意：本题与主站 234 题相同：https://leetcode-cn.com/problems/palindrome-linked-list/ 
//
// Related Topics 栈 递归 链表 双指针 👍 121 👎 0


package leetcode.editor.cn;

/**
 * 回文链表
 *
 * @author hongxiaobin
 * @date 2023-07-30 15:50:49
 */
public class P_AMhZSa {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_AMhZSa().new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        solution.isPalindrome(node1);
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
        private ListNode frontNode;

        /**
         * 递归
         *
         * @param head
         * @return
         */
        public boolean isPalindrome(ListNode head) {
            frontNode = head;
            return check(head);
        }

        public boolean check(ListNode currentNode) {
            if (currentNode != null) {
                if (!check(currentNode.next)) {
                    return false;
                }
                if (currentNode.val != frontNode.val) {
                    return false;
                }
                frontNode = frontNode.next;
            }
            return true;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
