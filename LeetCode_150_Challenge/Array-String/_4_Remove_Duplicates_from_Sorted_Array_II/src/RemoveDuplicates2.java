public class RemoveDuplicates2 {
    // 중복 두 번까진 OK! 세번부턴 어어, 안돼 !!
    // 바로 떠오르는건 뭐냐? 새로 배열을 하나 만든다.
    // -> 중복 수 만큼 count 하는 배열이다.

    // 근데.. 얘는 지금 "정렬" 되어 있다는걸 이용하면 어떨까.
    // 1, 1, 1 => i-1 = i = i+1

    public int removeDuplicates(int[] nums){

        // 솔직히 다 거기서 거기인 알고리즘 같은데.. 일단 얘는 정렬이 되어있으니까.

        int count = 1;
        // 카운트를 세는 변수 count 설정.
        int j = 1;


        // [1, 1, 1, 2, 2, 3]

        for (int i = 1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                // 이전과 다르다면 새로운 숫자임. 의심할 여지 없음. count 는 1로 설정한다.
                    nums[j] = nums[i];
                    j++;
                    count = 1;
                }

            else if (nums[i] == nums[i-1]){
                // 이전과 같다면? 1번만 카운트 된거면 괜찮음 ㅇㅇ count 2부터 얄짤없는거임.
                if (count < 2) {
                    nums[j] = nums[i];
                    j++;
                    count = 2;
                }
            }
        }
        return j;
    }

}
