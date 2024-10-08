public class RemoveDuplicate {
    // 이름에서 알 수 있듯, 정렬된 배열에서 중복된 숫자를 제거하는 것.
    // 이전 문제인 Remove 문제와 똑같다고 볼 수 있다.
    // 어차피 정렬이 되어 있기에, 굳이 정렬을 할 필요는 없다.
    public int removeDuplicates(int[] nums){
        // [0, 0, 1, 1, 1, 2, 2]
        // -> [0, 1, 2], k = 3;

        int j = 1;
        for (int i = 1; i<nums.length; i++){
            // 그냥 일단 집어넣고, 이전 것이랑만 비교하면 되는거 아닐까 ?
            if (nums[i] != nums[i-1]) {
                // 이전 것이랑 다르다면,
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
