//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 
//
// 返回删除后的链表的头节点。 
//
// 注意：此题对比原题有改动 
//
// 示例 1: 
//
// 输入: head = [4,5,1,9], val = 5
//输出: [4,1,9]
//解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
// 
//
// 示例 2: 
//
// 输入: head = [4,5,1,9], val = 1
//输出: [4,5,9]
//解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
// 
//
// 
//
// 说明： 
//
// 
// 题目保证链表中节点的值互不相同 
// 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点 
// 
//
// Related Topics 链表 👍 331 👎 0


package leetcode.editor.cn;

/**
 * 删除链表的节点
 *
 * @author hongxiaobin
 * @date 2023-07-29 22:36:23
 */
public class P_ShanChuLianBiaoDeJieDianLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ShanChuLianBiaoDeJieDianLcof().new Solution();
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
        public ListNode deleteNode(ListNode head, int val) {
            // 删除头节点
            if (head.val == val) {
                return head.next;
            }
            // 不是头节点
            // 指向被删除的前一个
            ListNode pre = head;
            // 指向被删除节点
            ListNode cur = head.next;
            while (cur != null && cur.val != val) {
                pre = cur;
                cur = cur.next;
            }
            if (cur!=null){
                pre.next = cur.next;
            }
            return head;
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
