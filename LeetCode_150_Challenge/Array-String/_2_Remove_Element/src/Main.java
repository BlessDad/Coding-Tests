import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Remove remove = new Remove();
        int [] nums = {1, 2, 2, 4, 5};
        int k = remove.removeElement(nums, 2);
        System.out.println(Arrays.toString(nums) + " k: " + k);
    }
}