import java.util.*;

public class MajorityElement {
    // 가장 많이 나온 원소를 return 하는 문제이다.
    // 기준은 ? n/2 이상이면 된다.
    // 흠.. 최소한 반 (보다 혹시 적은) 은 있다는 거네.

    // 배열을 만들어서 count 를 세자니 자바에서는 구현하기가 좀.. 뭐 하라면 할 수 있겠지 counts[n] 으로 놓으면 말이다.
    // -> 키:값 으로 이루어진 Map을 이용하자.


    public int findMajority(int [] nums){

        int n = nums.length;
        // HashMap Solution -> O(n), O(n)

        // Map<Integer, Integer> count = new HashMap<>();

        // 키: 값으로 이루어진 count 맵을 만들었다.
        // 인덱스는 중요하지 않고, 개수만을 다루기 때문에
        // key: nums[i] value: count

        // 로 사용하면 될거 같다.

        //        for (int i=0; i<n; i++){
        //            if(!count.containsKey(nums[i])){
        //                count.put(nums[i], 1);
        //            }
        //            else count.put(nums[i], count.get(nums[i]) + 1);
        //        }
        //
        //        // 이제 가장 큰 값을 찾으면 된다.
        //
        //        int value = 0;
        //        int key = -1;
        //        for (Map.Entry<Integer, Integer> entry: count.entrySet()){
        //            if (value < entry.getValue()){
        //                value = entry.getValue();
        //                key = entry.getKey();
        //            }
        //        }
        //        return key;


        // Moore Solution -> O(n), O(1)

        int count = 0; // 개수
        int candidate = 0; // 후보
        for (int i =0; i<n; i++){
            if (count == 0){
                candidate = nums[i];
            }
            if (nums[i] == candidate){
                count++;
            } else {
                count--;
            }



        }
        return candidate;
    }

}
