//给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。 
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 
//
// 示例 1： 
// 
// 
//输入：p = [1,2,3], q = [1,2,3]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：p = [1,2], q = [1,null,2]
//输出：false
// 
//
// 示例 3： 
// 
// 
//输入：p = [1,2,1], q = [1,1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 两棵树上的节点数目都在范围 [0, 100] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1037 👎 0


package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 相同的树
 *
 * @author hongxiaobin
 * @date 2023-07-11 21:12:03
 */
public class P100_SameTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P100_SameTree().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        /**
         * 广度优先搜索
         * 1、比较两个节点的值，如果两个节点的值不相同则两个二叉树一定不同；
         * 2、如果两个节点的值相同，则判断两个节点的子节点是否为空，如果只有一个节点的左子节点为空，或者只有一个节点的右子节点为空，则两个二叉树的结构不同，因此两个二叉树一定不同；
         * 3、如果两个节点的子节点的结构相同，则将两个节点的非空子节点分别加入两个队列，子节点加入队列时需要注意顺序，如果左右子节点都不为空，则先加入左子节点，后加入右子节点。
         *
         * @param p 树1
         * @param q 树2
         * @return 是否相同
         */
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            } else if (p == null || q == null) {
                return false;
            }
            Queue<TreeNode> queue1 = new LinkedList<>();
            Queue<TreeNode> queue2 = new LinkedList<>();
            queue1.offer(p);
            queue2.offer(q);
            while (!queue1.isEmpty() && !queue2.isEmpty()) {
                TreeNode node1 = queue1.poll();
                TreeNode node2 = queue2.poll();
                assert node2 != null;
                if (node1.val != node2.val) {
                    return false;
                }
                TreeNode left1 = node1.left, right1 = node1.right, left2 = node2.left, right2 = node2.right;
                if (left1 == null ^ left2 == null) {
                    return false;
                }
                if (right1 == null ^ right2 == null) {
                    return false;
                }
                if (left1 != null) {
                    queue1.offer(left1);
                }
                if (right1 != null) {
                    queue1.offer(right1);
                }
                if (left2 != null) {
                    queue2.offer(left2);
                }
                if (right2 != null) {
                    queue2.offer(right2);
                }
            }
            return queue1.isEmpty() && queue2.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
}
