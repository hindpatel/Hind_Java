import java.util.Random;

public class JTEnhancedFor {

    public static void main(String[] args) {

        int[] nums = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            nums[i] = r.nextInt(50);
            //System.out.println(nums[i]);
        }
        // for (int i = 0; i < nums.length; i++)
        for (int n : nums)
        {
            System.out.println(n);
        }
    }
}
