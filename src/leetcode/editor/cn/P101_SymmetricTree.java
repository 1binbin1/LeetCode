//给你一个二叉树的根节点 root ， 检查它是否轴对称。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [1,2,2,null,3,null,3]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 1000] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：你可以运用递归和迭代两种方法解决这个问题吗？ 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 2470 👎 0


package leetcode.editor.cn;

import java.util.LinkedList;

/**
 * 对称二叉树
 *
 * @author hongxiaobin
 * @date 2023-07-18 20:51:54
 */
public class P101_SymmetricTree {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P101_SymmetricTree().new Solution();
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
         * 迭代，每次放入队列中的两个元素要相同
         * 1、左子树：左-右-中
         * 2、右子树：右-左-中
         * 3、两次遍历相同则对称
         *
         * @param root
         * @return
         */
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            LinkedList<TreeNode> queue = new LinkedList<>();
            // 放入根节点的左右孩子
            queue.add(root.left);
            queue.add(root.right);
            while (queue.size() > 0) {
                TreeNode left = queue.removeFirst();
                TreeNode right = queue.removeFirst();
                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                // 判断值
                if (left.val != right.val) {
                    return false;
                }
                // 将左节点的左孩子，右节点的右孩子放入
                queue.add(left.left);
                queue.add(right.right);
                // 将左节点的右孩子，右节点的左孩子放入
                queue.add(left.right);
                queue.add(right.left);
            }
            return true;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
