package test.demo;

/**
 * @Author hongxiaobin
 * @Time 2023/4/18 0018-17:20:08
 */
public class T605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 采用跳格子的方式解决
        // 1.如果当前为1，需要跳两格
        // 2.如果当前为0，下一个为0，则可以种花并且跳两格 ，下一个为1，跳三格
        for (int i = 0; i < flowerbed.length && n > 0; ) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i += 3;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] num = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(num, n));
    }
}
