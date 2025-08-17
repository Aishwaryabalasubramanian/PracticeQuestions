package Patterns;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(getMedian(nums1,nums2));
    }

    private static float getMedian(int[] nums1,int[] nums2) {
        int[] merged= new int[nums1.length+nums2.length];
        int i,j;
        i=0;
        while(i<nums1.length){
            merged[i]=nums1[i];
            i++;
        }
         i = nums1.length;
         j =0;
        while(j<nums2.length){
            merged[i]=nums2[j];
            i++;
            j++;

        }
        Arrays.sort(merged);
        if(merged.length%2==0){
            int mid =merged.length/2;
            int ans= (merged[mid]+merged[mid-1]);
            if(ans%2!=0){
                return (ans/2)+0.5f;
            }
            return ans/2;
        }
        return merged[merged.length/2];

    }

}
