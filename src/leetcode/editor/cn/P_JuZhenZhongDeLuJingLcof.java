//给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["a","b"],["c","d"]], word = "abcd"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/ 
//
// Related Topics 数组 回溯 矩阵 👍 818 👎 0


package leetcode.editor.cn;

/**
 * 矩阵中的路径
 *
 * @author hongxiaobin
 * @date 2023-08-02 21:47:18
 */
public class P_JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_JuZhenZhongDeLuJingLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 回溯
         *
         * @param board
         * @param word
         * @return
         */
        public boolean exist(char[][] board, String word) {
            boolean[][] visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int i1 = 0; i1 < board[0].length; i1++) {
                    boolean flag = check(board, visited, i, i1, word, 0);
                    if (flag) {
                        return true;
                    }
                }
            }
            return false;
        }

        /**
         * @param board   原矩阵
         * @param visited 记录是否访问过
         * @param i       当前位置行
         * @param j       当前位置列
         * @param s       字符串
         * @param k       当前匹配位置
         * @return
         */
        private boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
            if (board[i][j] != s.charAt(k)) {
                // 当前匹配不上
                return false;
            } else if (k == s.length() - 1) {
                return true;
            }
            visited[i][j] = true;
            boolean result = false;
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            for (int[] direction : directions) {
                // 分别去找四个方向
                int ni = i + direction[0];
                int nj = j + direction[1];
                if (ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length) {
                    // 回溯
                    if (!visited[ni][nj]) {
                        boolean flag = check(board, visited, ni, nj, s, k + 1);
                        if (flag) {
                            result = true;
                            break;
                        }
                    }
                }
            }
            visited[i][j] = false;
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
