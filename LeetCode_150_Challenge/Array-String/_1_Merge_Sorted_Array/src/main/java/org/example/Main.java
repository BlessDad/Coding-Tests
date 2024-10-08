package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums1, 0, nums1.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        // nums1, nums2 두 개의 배열이 주어진다. 그리고 m, n 은 각 배열의 '요소' 를 나타낸다.
        // 요소라 함은 .. ? "인정" 되는 수. 여기서는 "0" 만 아니면 된다는 것.
        // 정렬을 시킬땐, 내림차순으로 정렬되어야 하는 듯 하다.
        // 그리고 반드시 nums 1 배열에 저장이 되어야 한다.

        // 만약 nums1 = [1,2,3,0,0,0] 이라면 m = 3
        // nums2 = [], n = 0 but nums1 = [0], m = 0
        // 뭐... 어쨌든 0은 인정되지 않는다.

        // nums1 의 길이는 어차피 m + n 이다.
        // [1,2,3,0,0,0] , [2,5,6]
        // 길이는 6.
        // 정렬만 잘 해주면 된다는 것.

        // [] [1]

        // 그냥 빈자리 채우는거 같은데 ?
        for (int i=m; i<m+n; i++){
            nums1[i] = nums2[i-m];
        }

        System.out.println("Before Sorting: nums1 + nums2: " +Arrays.toString(nums1));
        // 이렇게 하면 일단 nums1 배열을 다 채울수 있다.



    }
}