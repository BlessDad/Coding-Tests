package org.example;

// 간단한 수학 느낌.

// diff[] (난이도), time[] (걸리는 시간)

// 예를 들어 diff = 3, time_cur = 2, time_prev = 4인 경우, level에 따라 퍼즐을 푸는데 걸리는 시간은 다음과 같습니다.
// level = 1이면, 퍼즐을 3 - 1 = 2번 틀립니다. 한 번 틀릴 때마다 2 + 4 = 6의 시간을 사용하고,
// 다시 퍼즐을 푸는 데 2의 시간을 사용하므로 총 6 × 2 + 2 = 14의 시간을 사용하게 됩니다.
// level = 2이면, 퍼즐을 3 - 2 = 1번 틀리므로, 6 + 2 = 8의 시간을 사용하게 됩니다.
// level ≥ 3이면 퍼즐을 틀리지 않으며, 2의 시간을 사용하게 됩니다.

// if
// diff [1,5,3] times [2,4,7], limit 30 result ?

// low level 을 구하는거니 1레벨 부터 가야함.

// 1레벨이면?

// 2 + (diff[1] - level) x(times[1] + times[0]) + times[1] + (diff[2] - level) x (cur_times + prev_times ) + cur_times

// 2 + (4) x (6) + 4 + (2) x (7+4) + 7 = 59

// 2레벨이면?

// 2+ 3 x (6) + 4 + 1x(11) + 4 = 39

// 3 레벨 ?

// 2 + 2 x (6) + 4 + 7 = 25


import javax.swing.plaf.synth.SynthUI;

public class Main {
    public static void main(String[] args) {
        int[] diffs = {1, 4,4 , 2};
        int[] times = {6, 3, 8, 2};

        CalculateTime calculateTime = new CalculateTime();
        System.out.println(calculateTime.calculate(diffs, times, 59));

    }
}