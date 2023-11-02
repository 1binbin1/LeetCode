//给你一个字符串 jewels 代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头。 stones 中每个字符代表了一种你拥有的石头的类型，
//你想知道你拥有的石头中有多少是宝石。 
//
// 字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。 
//
// 
//
// 示例 1： 
//
// 
//输入：jewels = "aA", stones = "aAAbbbb"
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：jewels = "z", stones = "ZZ"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= jewels.length, stones.length <= 50 
// jewels 和 stones 仅由英文字母组成 
// jewels 中的所有字符都是 唯一的 
// 
//
// Related Topics 哈希表 字符串 👍 750 👎 0


package leetcode.editor.cn;

/**
 * 宝石与石头
 *
 * @author hongxiaobin
 * @date 2023-07-24 08:46:03
 */
public class P771_JewelsAndStones {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P771_JewelsAndStones().new Solution();
        solution.numJewelsInStones("aA", "aAAbbbb");
    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 判断字符串jewels中的每个字母在stones中出现的总次数
         *
         * @param jewels
         * @param stones
         * @return
         */
        public int numJewelsInStones(String jewels, String stones) {
            int res = 0;
            // 把jewels转为字符串集合mask
            long mask = 0;
            for (char c : jewels.toCharArray()) {
                // 按位与  97：01100001   63：00111111  &之后为00100001即为33（相同为1则为1，否则为0）
                int i = c & 63;
                // 左移，高位丢弃，低位补0，即1*2^i
                long l = 1L << i;
                // 按位或 只要有1 返回1 否则0
                mask = mask | l;
            }
            for (char c : stones.toCharArray()) {
                int i = c & 63;
                long l = mask >> i;
                res += l & 1;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
