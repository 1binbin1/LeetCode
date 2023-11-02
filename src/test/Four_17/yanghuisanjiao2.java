package test.Four_17;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hongxiaobin
 * @Time 2023/4/17 0017-16:08:48
 */
public class yanghuisanjiao2 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret.get(ret.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
