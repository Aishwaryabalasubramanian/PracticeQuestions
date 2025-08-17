package Patterns;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);

    }
    private static void removeDuplicates(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++) {
            int start=nums[i];
            if(start != Integer.MAX_VALUE) {
                for (int j = i + 1; j < nums.length; j++) {
                    if( nums[i]==nums[j]) {
                        nums[j]=Integer.MAX_VALUE;
                    }

                }
            }


        }
        Arrays.sort(nums);
        for(int num : nums){
            if(num!=Integer.MAX_VALUE){
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
}
