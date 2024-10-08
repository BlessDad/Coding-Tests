import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicate.removeDuplicates(nums);
        System.out.println("nums: " + Arrays.toString(nums) + " k: " + k);
    }
}