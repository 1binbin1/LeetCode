//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。 
// 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -10⁴ <= Node.val <= 10⁴ 
// 
//
// Related Topics 树 深度优先搜索 二叉树 👍 1355 👎 0


package leetcode.editor.cn;

/**
 * 平衡二叉树
 *
 * @author hongxiaobin
 * @date 2023-07-19 11:19:44
 */
public class P110_BalancedBinaryTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P110_BalancedBinaryTree().new Solution();
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
         * 迭代
         *
         * @param root
         * @return
         */
        public boolean isBalanced(TreeNode root) {
            return getDepth(root) != -1;
        }

        private int getDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = getDepth(node.left);
            if (left == -1) {
                return -1;
            }
            int right = getDepth(node.right);
            if (right == -1) {
                return -1;
            }
            return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
