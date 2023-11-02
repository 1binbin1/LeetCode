package test.Four_17;

/**
 * @Author hongxiaobin
 * @Time 2023/4/17 0017-16:28:34
 */
public class T125 {
    public static boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder reverse = new StringBuilder(result).reverse();
        return result.toString().equals(reverse.toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
