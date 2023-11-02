/*
 * test.treadTest, 2023-07-19
 * Copyright© 2023 hongxiaobin(1binbin),Inc. All rights reserved.
 * Github link : http://github.com/1binbin
 */
package test;

/**
 * @Author hongxiaobin
 * @Time 2023/7/19 0019-11:14:59
 */
public class treadTest {
    private static int count = 0;

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int i1 = 0; i1 < 5; i1++) {
                    System.out.println(count++);
                }
            });
            threads[i].start();
        }
    }
}
