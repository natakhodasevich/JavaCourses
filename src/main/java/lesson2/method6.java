package lesson2;

import java.util.Arrays;

public class method6 {
    public static void main(String[] args) {
        int[] nums= new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= i+1;
        }
        System.out.println(Arrays.toString(nums));
    }
}
