package org.example;

public class CalculateTime {

    // 1 11, 3
    // 6, 3
    // 3.5, 3
    // 1 3.5, 3
    // 2.25 , 3
    // 3.25 3.5 , 3
    // 3.45 3
    // 4.45 3.5

    public boolean isPossible(int[] diffs, int[] times, long longLevel, long limit) {
        long score = 0;
        score += times[0];
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] > longLevel) {
                long gap = diffs[i] - longLevel;
                score += gap * (times[i] + times[i - 1]) + times[i];
            } else {
                score += times[i];
            }
        }
        if (score <= limit) return true;
        else return false;

    }

    public int calculate(int[] diffs, int[] times, long limit) {
        long start = 1;
        long end = limit;


        while (start < end) { // 둘이 역전되는순간, 바로 그값임. 2.8 3.5 3?
            long longLevel = (start + end) / 2;
            if (isPossible(diffs, times, longLevel, limit)) { // 가능하다는것? end 를 level 로 옮겨도 된다는 거.
                end = longLevel;
            } else { // 불가능하다는것? start 를 옮겨도 된다는것.
                start = longLevel + 1;

            }

        }


        return (int) start;
    }
}
















