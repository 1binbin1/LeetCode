//一个整数 num 的 k 美丽值定义为 num 中符合以下条件的 子字符串 数目： 
//
// 
// 子字符串长度为 k 。 
// 子字符串能整除 num 。 
// 
//
// 给你整数 num 和 k ，请你返回 num 的 k 美丽值。 
//
// 注意： 
//
// 
// 允许有 前缀 0 。 
// 0 不能整除任何值。 
// 
//
// 一个 子字符串 是一个字符串里的连续一段字符序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 240, k = 2
//输出：2
//解释：以下是 num 里长度为 k 的子字符串：
//- "240" 中的 "24" ：24 能整除 240 。
//- "240" 中的 "40" ：40 能整除 240 。
//所以，k 美丽值为 2 。
// 
//
// 示例 2： 
//
// 
//输入：num = 430043, k = 2
//输出：2
//解释：以下是 num 里长度为 k 的子字符串：
//- "430043" 中的 "43" ：43 能整除 430043 。
//- "430043" 中的 "30" ：30 不能整除 430043 。
//- "430043" 中的 "00" ：0 不能整除 430043 。
//- "430043" 中的 "04" ：4 不能整除 430043 。
//- "430043" 中的 "43" ：43 能整除 430043 。
//所以，k 美丽值为 2 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10⁹ 
// 1 <= k <= num.length （将 num 视为字符串） 
// 
//
// Related Topics 数学 字符串 滑动窗口 👍 15 👎 0


package leetcode.editor.cn;

/**
 * 找到一个数字的 K 美丽值
 *
 * @author hongxiaobin
 * @date 2023-07-18 20:41:50
 */
public class P2269_FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P2269_FindTheKBeautyOfANumber().new Solution();
        System.out.println(solution.divisorSubstrings(430043, 2));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int divisorSubstrings(int num, int k) {
            String s = Integer.toString(num);
            int count = 0;
            for (int i = k - 1; i < s.length(); i++) {
                int substring = Integer.parseInt(s.substring(i - k + 1, i+1));
                if (substring != 0 && num % substring ==0) {
                    count ++;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
