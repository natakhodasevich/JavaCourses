package lesson2;

import java.util.Arrays;

public class method7 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }

        }System.out.println(Arrays.toString(nums));
    }
}

