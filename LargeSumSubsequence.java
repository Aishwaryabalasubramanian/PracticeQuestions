import java.util.Arrays;

public class LargeSumSubsequence {
    public static void main(String[] args) {
        int k =3;
        int[] nums = new int[]{1,-2,3,4};
        int[] result1 = new int[k];
        result1=maxSubsequence(nums, k);
    }
    public  static int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        int[] nums1 = nums.clone();
        int[] result1 = new int[k];
        int j =0;
        for(int i =0 ; i<nums.length;i++){
            if(j<k){
                int index=findIndex(nums);
                result[j]=index;
                nums[index]= Integer.MIN_VALUE;
                j++;
            }
            else{
                break;
            }

        }
        Arrays.sort(result);
        for(int l =0; l<k;l++){
            result1[l]=nums1[result[l]];
        }
        return result1;

    }
    public  static int findIndex(int[] nums){
        int max =0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]> nums[max]){
                max=i;
            }
        }
        return max;
    }
}
