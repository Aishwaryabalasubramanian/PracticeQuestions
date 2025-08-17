import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> triplets1 = new ArrayList<>();
        int[] nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums1);
        triplets1=threeSum(nums1);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int i,left,right;
        Set<List<Integer>> triplets= new HashSet<>();
        for(i = 0; i <nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    triplets.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else{
                    left++;
                }
            }

        }
        return new ArrayList<>(triplets);

    }
}
