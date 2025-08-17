package Practice.src;

import java.util.Arrays;

public class ReverseArrayInGroups {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k =3;

        System.out.println(Arrays.toString(reverseInGroups(arr,k)));

    }
        public static int[] reverseInGroups(int[] arr, int k) {
            // code here
            int start =0;
            int end =k-1;
            while(start<arr.length){
                if(end< arr.length){
                    arr=swap(start,end,arr);
                }else{
                    arr=swap(start,arr.length-1,arr);
                    break;
                }
                start=end+1;
                end=end+k;
            }
            return arr;


        }
        public static int[] swap(int start,int end,int[] arr){
            while(start<end){
                int temp =arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            return arr;
        }

}
