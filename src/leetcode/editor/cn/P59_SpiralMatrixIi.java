//给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：n = 3
//输出：[[1,2,3],[8,9,4],[7,6,5]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics 数组 矩阵 模拟 👍 1087 👎 0


package leetcode.editor.cn;

/**
 * 螺旋矩阵 II
 *
 * @author hongxiaobin
 * @date 2023-07-15 21:14:40
 */
public class P59_SpiralMatrixIi {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P59_SpiralMatrixIi().new Solution();
        solution.generateMatrix(4);
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] result = new int[n][n];
            // 定义每循环一次的起始位置
            int startx = 0, starty = 0;
            // 需要转几圈，如n为3，那么只需要一圈
            int loop = n / 2;
            // 矩阵中间的位置
            int mid = n / 2;
            // 用来给矩阵的每一个空赋值
            int count = 1;
            // 每一圈循环都需要控制每一条边遍历需要减掉的长度
            int offset = 1;
            int i, j;

            while (loop-- > 0) {
                // 开始循环一圈（均为左闭右开）
                // 从左到右
                for (j = starty; j < starty + n - offset; j++) {
                    result[startx][j] = count++;
                }
                // 从上到下
                for (i = startx; i < startx + n - offset; i++) {
                    result[i][j] = count++;
                }
                // 从右到左
                for (; j > starty; j--) {
                    result[i][j] = count++;
                }
                for (; i > startx; i--) {
                    result[i][j] = count++;
                }

                // 下一圈开始，更新起始位置
                startx++;
                starty++;
                // 每一圈之后都有每条边少两个元素不需要算在长度内
                offset += 2;
            }

            // 赋值中间位置
            if (n % 2 != 0) {
                result[mid][mid] = count;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
