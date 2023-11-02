package test.Four_17;

/**
 * @Author hongxiaobin
 * @Time 2023/4/17 0017-14:27:54
 */
public class demo {
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] datesOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] prefixSum = new int[13];
        for (int i = 0; i < 12; i++) {
            prefixSum[i + 1] = prefixSum[i] + datesOfMonth[i];
        }
        int arriveAliceDay = clculateDayOfYear(arriveAlice, prefixSum);
        int leaveAliceDay = clculateDayOfYear(leaveAlice, prefixSum);
        int arriveBobDay = clculateDayOfYear(arriveBob, prefixSum);
        int leaveBobDay = clculateDayOfYear(leaveBob, prefixSum);
        return Math.max(0, Math.min(leaveAliceDay, leaveBobDay) - Math.max(arriveAliceDay, arriveBobDay));
    }

    // 计算每个日子在一年中的第几天
    public static int clculateDayOfYear(String day, int[] prefixSum) {
        int month = Integer.parseInt(day.substring(0, 2));
        int date = Integer.parseInt(day.substring(3));
        return prefixSum[month - 1] + date;
    }

    public static void main(String[] args) {
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}
