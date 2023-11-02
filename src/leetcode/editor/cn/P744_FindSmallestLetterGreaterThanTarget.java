//给你一个字符数组 letters，该数组按非递减顺序排序，以及一个字符 target。letters 里至少有两个不同的字符。 
//
// 返回 letters 中大于 target 的最小的字符。如果不存在这样的字符，则返回 letters 的第一个字符。 
//
// 
//
// 示例 1： 
//
// 
//输入: letters = ["c", "f", "j"]，target = "a"
//输出: "c"
//解释：letters 中字典上比 'a' 大的最小字符是 'c'。 
//
// 示例 2: 
//
// 
//输入: letters = ["c","f","j"], target = "c"
//输出: "f"
//解释：letters 中字典顺序上大于 'c' 的最小字符是 'f'。 
//
// 示例 3: 
//
// 
//输入: letters = ["x","x","y","y"], target = "z"
//输出: "x"
//解释：letters 中没有一个字符在字典上大于 'z'，所以我们返回 letters[0]。 
//
// 
//
// 提示： 
//
// 
// 2 <= letters.length <= 10⁴ 
// letters[i] 是一个小写字母 
// letters 按非递减顺序排序 
// letters 最少包含两个不同的字母 
// target 是一个小写字母 
// 
//
// Related Topics 数组 二分查找 👍 274 👎 0


package leetcode.editor.cn;

/**
 * 寻找比目标字母大的最小字母
 *
 * @author hongxiaobin
 * @date 2023-07-18 17:10:58
 */
public class P744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P744_FindSmallestLetterGreaterThanTarget().new Solution();
        System.out.println(solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int length = letters.length;
            if (target >= letters[length - 1]) {
                return letters[0];
            }
            int low = 0, high = length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (letters[mid] > target) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return letters[low];
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
