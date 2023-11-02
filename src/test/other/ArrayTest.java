package test.other;

/**
 * @Author hongxiaobin
 * @Time 2023/2/21-9:21
 */
public class ArrayTest {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[i].length - 1;
        while (i < matrix.length - 1 && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            }
            if (target > matrix[i][j]) {
                i++;
            }
            if (target < matrix[i][j]) {
                j--;
            }
        }
        return target == matrix[matrix.length - 1][0];
    }

    public static void main(String[] args) {
        /*int[][] Test = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};*/
        int[][] test = {{}};
        System.out.println(findNumberIn2DArray(test, 1));
    }
}
