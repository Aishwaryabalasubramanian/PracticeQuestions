public class HillAndValley {
    public static void main(String[] args) {

        int[] nums = {2,4,1,1,6,5};
        System.out.println(countHillValley(nums));

    }
    public  static int countHillValley(int[] nums) {

        int n =nums.length,count =0;
        for(int i =1;i<n-1;i++){

            int j =i-1;
            if(nums[i]==nums[j]){
                continue;
            }
            while( j>=0  && nums[i]==nums[j]){
                j--;
            }
            int k =i+1;
            while(k<n && nums[i]==nums[k]){
                k++;
            }
            if(k<n && j>=0 && ((nums[j]<nums[i] && nums[k]<nums[i]) || (nums[j]>nums[i] && nums[k]>nums[i]))){
                count++;
            }

        }
        return count;

    }
}
