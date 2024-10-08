import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k = removeDuplicates2.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums) + " k: " + k);
    }
}