public class isStraightLine {
    public static void main(String[] args) {
        int[] side1 = new int[]{1,1};
        int[] side2 = new int[]{2,2};
        int[] side3 = new int[]{3,3};
        int slope1=findSlope(side1, side2);
        int slope2=findSlope(side2, side3);
        if (slope1==slope2){
            System.out.println("Straight Line");
        }
        else{
            System.out.println("Not Straight Line");
        }


    }
    public static int findSlope(int[] arr1, int[] arr2) {
       int m;

       m=(arr1[1]-arr2[1])/(arr1[0]-arr2[0]);
       return m;
    }
}

