//数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，
//等等。 
//
// 请写一个函数，求任意第n位对应的数字。 
//
// 
//
// 示例 1： 
//
// 输入：n = 3
//输出：3
// 
//
// 示例 2： 
//
// 输入：n = 11
//输出：0 
//
// 
//
// 限制： 
//
// 
// 0 <= n < 2^31 
// 
//
// 注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/ 
//
// Related Topics 数学 二分查找 👍 352 👎 0


package leetcode.editor.cn;

/**
 * 数字序列中某一位的数字
 *
 * @author hongxiaobin
 * @date 2023-08-08 20:30:01
 */
public class P_ShuZiXuLieZhongMouYiWeiDeShuZiLcof {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P_ShuZiXuLieZhongMouYiWeiDeShuZiLcof().new Solution();
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 需要计算出第n位是哪一个数字的第几位数
         * 1位数的范围是1-9，一共9个数字，所有1位数之和为1*9=9
         * 2位数的范围是10-99，一共90个数，所有2位数之和为2*90=180
         *
         * @param n
         * @return
         */
        public int findNthDigit(int n) {
            int low = 1, high = 9;
            while (low < high) {
                int mid = (low + high) / 2;
                if (totalDigits(mid) < n) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            int d = low;
            int prevDigits = totalDigits(d - 1);
            int index = n - prevDigits - 1;
            int start = (int) Math.pow(10, d - 1);
            int num = start + index / d;
            int digitIndex = index % d;
            return (num / (int) (Math.pow(10, d - digitIndex - 1))) % 10;
        }

        private int totalDigits(int lenght) {
            int digits = 0;
            int current = 1, currentcount = 9;
            while (current <= lenght) {
                digits += current * currentcount;
                current++;
                currentcount *= 10;
            }
            return digits;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
