package test.other;

/**
 * @Author hongxiaobin
 * @Time 2023/3/2-9:04
 */
public class toNum {
    public static String multiply(String num1, String num2) {
        long numA = tonum(num1);
        long numB = tonum(num2);
        long reult = numA * numB;
        System.out.println(reult);
        return String.valueOf(reult);
    }

    private static long tonum(String s) {
        char[] chars = s.toCharArray();
        long num = 0;
        int len = chars.length;
        for (int i = 0; i < chars.length; i++) {
            num += ((int) chars[i] - 48) * Math.pow(10, len - i - 1);
        }
        return num;
    }

    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));
    }
}
