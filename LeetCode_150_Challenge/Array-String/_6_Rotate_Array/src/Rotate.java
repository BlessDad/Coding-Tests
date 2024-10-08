import java.util.Arrays;

public class Rotate {

    public void mirroring(int[] nums, int start, int end){
        int temp = 0;
        while (start< end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k){
        // 차분하게 생각해보자.. 방법은 많을 것.
        // 1, 2, 3, 4, 5 이고 k = 3 이라면
        // 3, 4, 5, 1, 2 가 되면 된다.
        // 즉, 세번 뒤로 미는것.

        // 새로운 배열을 만들어서 집어넣고 옮기는 행위는 실패 -> time over

        // discussion 에서 발상의 전환을 얻음.

        // 5, 4, 3, 2, 1 이렇게 회전을 시키는거다. 그리고
        // 5, 4, 3 | 2, 1    =>   k 를 기점으로 나누어주고 또 회전한다.
        // 3, 4, 5, 1, 2     => 놀랍게도 같은 결과가 나온다.
        // 18 번 한다고 쳐봐. n =5, k=  18 k%n
        // 구현만 해보자. 처음과 끝을 바꾸는 형태로 하면 된다.
        // k + n % n
        // 일단 전체 배열을 회전하는 건 간단

        // [1,2] , k = 1
        // [1,2] , k = 4

        // k는 결국, 몇 번 할거냐는 거다. k 에 따라 피봇 위치를 옮겨주면 되는거 아닌가?
        int n = nums.length;

        mirroring(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
        mirroring(nums, 0, k%n-1);
        System.out.println(Arrays.toString(nums));
        mirroring(nums, k%n, n-1);
        System.out.println(Arrays.toString(nums));

    }
}
