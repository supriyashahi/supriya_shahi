import java.util.*;

public class SmallerNumberThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = smallerNumbersThanCurrent(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
