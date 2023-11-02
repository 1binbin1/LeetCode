//整数的 数组形式 num 是按照从左到右的顺序表示其数字的数组。 
//
// 
// 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。 
// 
//
// 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：num = [1,2,0,0], k = 34
//输出：[1,2,3,4]
//解释：1200 + 34 = 1234
// 
//
// 示例 2： 
//
// 
//输入：num = [2,7,4], k = 181
//输出：[4,5,5]
//解释：274 + 181 = 455
// 
//
// 示例 3： 
//
// 
//输入：num = [2,1,5], k = 806
//输出：[1,0,2,1]
//解释：215 + 806 = 1021
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num.length <= 10⁴ 
// 0 <= num[i] <= 9 
// num 不包含任何前导零，除了零本身 
// 1 <= k <= 10⁴ 
// 
//
// Related Topics 数组 数学 👍 233 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组形式的整数加法
 *
 * @author hongxiaobin
 * @date 2023-07-18 17:46:01
 */
public class P989_AddToArrayFormOfInteger {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P989_AddToArrayFormOfInteger().new Solution();
        System.out.println(solution.addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> res = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i : num) {
                stringBuilder.append(i);
            }
            String sum = Integer.toString(Integer.parseInt(stringBuilder.toString()) + k);
            char[] chars = sum.toCharArray();
            for (char aChar : chars) {
                res.add(Integer.parseInt(aChar + ""));
            }
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
