import java.util.Arrays;

public class Remove {

    int deleted = -1;

    public void removeSort(int[] nums, int k){
        // [1, deleted, deleted, 3, 4, deleted, 5]   k = 4 nums.length = 7
        // i , j 설정.
        // i 는 처음부터, j 는 끝에서부터.
        // i는 deleted 에 도달시 멈춤. j != deleted 라면 swap.
        // if (i > (k-1)) return;

        // 예외 사항 추가, 만약 nums 길이가 1이라면 ? 또, 제거할 게 업다면 ?
        if (nums.length == 1 || nums.length == k) return;
        int i = 0;
        int j = nums.length - 1;

        while(i <= (k-1)){
            System.out.println("시작! " + i + k);
            while(i <= (k-1) && nums[i] != deleted){
                i++;
                System.out.println("i 증가 ? " + Arrays.toString(nums) + i);
            }

            while (i <= (k-1) && nums[j] == deleted){
                j--;
                System.out.println("j 감소 ? " + Arrays.toString(nums) + j);
            }
            System.out.println(" 멈춘 시점에서 각 인덱스는 ? " + Arrays.toString(nums) + "i: " + i + "j: " + j);
//            if (i < (k-1)){
                System.out.println("스왑 진행!");
                swap(nums, i, j);
//            }
        }

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeElement(int[] nums, int val){
        // nums 라는 배열과, 제거해야하는 값 val 이 주어진다.
        // 생각할 부분? 제거가 됨과 동시에 순서가 바뀌어야 한다.
        // 제거한다면 어떤 수로 내야 하는가?


        // [1, 2, 2, 4, 5, 2, 4] , val = 2
        // j = nums.length -1
        // if nums[i] = val, nums[i] = deleted, swap (nums[i], j)
        // j--
        // if (i>j) return;

        // -> 그냥 deleted 를 뒤로 싹 빼는게 나을듯 ?
        int k = nums.length;
        int j = 0;

        // -1 로 두면 될거같다. 문제에서 val >=0 이니까.
        for (int i=0; i<nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 이렇게 하면 val 에 해당하는 값들은 모두 deleted 가 될거다. k 값도 적절히 구할 수 있다.


        return j;
    }
}
