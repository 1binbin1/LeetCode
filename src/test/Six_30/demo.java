
/*
 * test.Six_30.demo, 2023-07-05
 * Copyright© 2023 hongxiaobin(1binbin),Inc. All rights reserved.
 * Github link : http://github.com/1binbin
 */
package test.Six_30;


/**
 * @Author hongxiaobin
 * @Time 2023/6/30 0030-10:39:19
 */
public class demo {
    public static boolean isCircularSentence(String sentence) {
        String[] stringSpilt = sentence.split(" ");
        for (int i = 0; i < stringSpilt.length - 1; i++) {
            char end = stringSpilt[i].charAt(stringSpilt[i].length() - 1);
            char begin = stringSpilt[i + 1].charAt(0);
            if (end != begin) {
                return false;
            }
        }
        char begin1 = stringSpilt[0].charAt(0);
        char end1 = stringSpilt[stringSpilt.length - 1].charAt(stringSpilt[stringSpilt.length - 1].length() - 1);
        return begin1 == end1;
    }

    public static void main(String[] args) {
        String s = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(s));
    }
}
