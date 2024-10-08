package org.example;

public class QuickSort {

    public void quickSort(int[] nums, int start, int end){
        // 여기서 start 는 가장 첫 번째 인덱스, end 는 마지막 인덱스가 된다.
        // pivot = start 가 될 것.

        // 어차피 피봇은 index 0 아니냐? or 어차피 j 위치(end) 는 nums.length 아니냐?

        // -> 분할이 한번 완료되면, pivot 보다 작은 값들은 left, 큰 값들은 right 로 분할 된다.
        // 여기서 right 에서의 pivot 은 0이 아닐 수 있다. 마찬가지로 left 에서의 end 는 nums.length 가 아닐 수 있다.

        // 기본 동작 알고리즘은, 퀵 정렬을 통해 pivot 의 알맞은 위치를 찾아내고, 이를 기준으로 left, right 로 나누고 각각을 정렬하는것. (반복)

        // 퀵 정렬을 사용해 pivot 의 알맞은 위치를 찾아낸다.
        // partition = 퀵 정렬을 한번 수행해주는 함수, pivot 의 위치를 반환해주면 된다.

        // 크기가 1 이하거나, start >= end 라면 진행하지 않는다.
        if (start >= end) return;
        if (nums.length <=1) return;

        int pivot = partition(nums, start, end);

        // left 에 대하여 정렬을 수행한다.
        quickSort(nums, start, pivot - 1 );

        // right 에 대하여 정렬을 수행한다.
        quickSort(nums, pivot +1, end);
    }

    public int partition(int[] nums, int start, int end){

        // 단계별로 진행하자.

        // 1. 피봇을 설정한다. (첫번째 인덱스)
        // 2. i, j 를 설정한다. (두번째 인덱스, 마지막 인덱스)
        // 3. i, j 는 순차적으로 탐색하며 자기보다 큰 값, 작은 값을 발견하면 서로 swap 한다. (while i<=j)
        // 4. i > j 가 되면 pivot <-> j, pivot 을 기준으로 left, right 로 분할한다.
        // 5. left, right 에 대하여 퀵 정렬을 진행한다.
        // 6. 병합한다.



        // 1 ~ 2 단계 수행.
        int pivot = start;
        int i = start + 1;
        int j = end;

        // 3단계 수행.

        while (i<=j){

            while (i<=j && nums[i] <= nums[pivot]) {
                // i 는 pivot 보다 크지 않다면 계속 탐색할 수 있다.
                i++;
            }

            while (i<=j && nums[j] >= nums[pivot]){
                // 마찬가지로, j 는 pivot 보다 작지 않다면 게속 탐색할 수 있다.
                j--;
            }

            // 여기까지 왔다면, i 와 j 가 서로 탐색을 멈췄을 때일거다.
            // 둘을 서로 swap 시켜주자.

            if (i<j){
                // 물론, i 가 j 를 역전하지 않았을 때여야 한다.
                swap(nums, i, j);
            }

        }
        // 이제 i 와 j 가 역전되었다.
        // pivot 과 j 의 위치를 바꿔준다. -> j 의 위치가 "알맞은" 피봇의 위치가 된다.

        swap(nums, pivot, j);

        // 알맞은 피봇 위치인 j 를 리턴해준다. 이제 j 를 기준으로 left, right 를 나눌 수 있다.
        return j;

    }

    public void swap(int[] nums, int i, int j){
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
