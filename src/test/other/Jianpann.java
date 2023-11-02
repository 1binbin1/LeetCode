package test.other;

import java.util.ArrayList;

/**
 * @Author hongxiaobin
 * @Time 2023/2/23-11:23
 */
public class Jianpann {
    public static String[] findWords(String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        String rowIdx = "12210111011122000010020202";
        for (int i = 0; i < words.length; i++) {
            boolean is = true;
            char idx = rowIdx.charAt(Character.toLowerCase(words[i].charAt(0)) - 'a');
            for (int j = 1; j < words[i].length(); ++j) {
                if (rowIdx.charAt(Character.toLowerCase(words[i].charAt(j)) - 'a') != idx) {
                    is = false;
                    break;
                }
            }
            if (is) {
                arrayList.add(words[i]);
            }
        }
        String[] strings = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i) {
            strings[i] = arrayList.get(i);
        }
        return strings;
    }
}
