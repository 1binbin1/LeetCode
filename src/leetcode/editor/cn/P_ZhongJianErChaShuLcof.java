//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
// 
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 1101 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树
 *
 * @author hongxiaobin
 * @date 2023-07-30 10:03:22
 */
public class P_ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ZhongJianErChaShuLcof().new Solution();
    }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        private Map<Integer, Integer> indexMap;

        /**
         * 构建二叉树
         * 递归
         *
         * @param preorder 前序遍历
         * @param inorder  中序遍历
         * @return
         */
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            indexMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                indexMap.put(inorder[i],i);
            }
            return myBuildTree(preorder,inorder,0,n-1,0,n-1);
        }

        /**
         * 构建二叉树
         *
         * @param preorder       前序
         * @param inorder        中序
         * @param preorder_left  前序左端点
         * @param preorder_right 前序右端点
         * @param inorder_left   中序左端点
         * @param inorder_right  中序右端点
         * @return
         */
        public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
            if (preorder_left > preorder_right) {
                return null;
            }

            // 前序的第一个元素为根节点
            int preorder_root = preorder_left;
            // 在中序中定位到根节点
            int inorder_root = indexMap.get(preorder[preorder_root]);

            // 建立根节点
            TreeNode root = new TreeNode(preorder[preorder_root]);
            // 左子树的数目
            int size_left_subtree = inorder_root - inorder_left;
            // 构建左子树
            root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
            // 构建右子树
            root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
            return root;
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
    }
}
