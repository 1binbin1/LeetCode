//自除数 是指可以被它包含的每一位数整除的数。 
//
// 
// 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。 
// 
//
// 自除数 不允许包含 0 。 
//
// 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right] 内所有的 自除数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：left = 1, right = 22
//输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// 
//
// 示例 2: 
//
// 
//输入：left = 47, right = 85
//输出：[48,55,66,77]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= left <= right <= 10⁴ 
// 
//
// Related Topics 数学 👍 256 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 *
 * @author hongxiaobin
 * @date 2023-07-18 16:27:43
 */
public class P728_SelfDividingNumbers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P728_SelfDividingNumbers().new Solution();
        System.out.println(solution.selfDividingNumbers(1, 22));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                // 判断是否为自除数
                String s = Integer.toString(i);
                boolean flag = true;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '0' || i % Integer.parseInt(String.valueOf(s.charAt(j))) != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(Integer.parseInt(s));
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
