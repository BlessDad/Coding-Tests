public class JumpGame {

    public boolean canJump(int[] nums){
        //     int goal = nums.length - 1;
        //     for (int i=nums.length - 2; i>=0; i--){
        //         if (nums[i] >= goal -i) goal = i;
        //     }
        //     return goal==0;
        // }
        int n = nums.length;
        int max = 0;
        for (int i=0; i<n; i++){
            if (max < i) return false;
            max = Math.max(max, i+nums[i]);
            if (max >= n-1) return true;
        }
        return true;
    }
}
