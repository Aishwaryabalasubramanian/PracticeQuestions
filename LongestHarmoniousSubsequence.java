import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,1,3,1,-14,1,-13};
         int ans =findLHS(nums);
    }
    public  static int findLHS(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1]){
            return 0;
        }
        int sum,count;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            count =1;
            for(int j= i+1;j<nums.length;j++){
                sum = nums[j]-nums[i];
                if(sum!=0 && sum!= 1){
                    break;
                }
                count++;

            }
            if(count>max){
                max=count;
            }


        }
        if(max ==1){
            max=0;
        }
        return max;

    }
}
