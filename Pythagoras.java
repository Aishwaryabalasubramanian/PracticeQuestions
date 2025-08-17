import java.util.Arrays;

public class Pythagoras {
    public static void main(String[] args) {
        int[] sidesOfTriangle = new int[] {10,6,8};
        Triangle triangle = new Triangle(-4,-5,-1);
        System.out.println(triangle.sideOne);
        System.out.println(triangle.sideTwo);
        System.out.println(triangle.sideThree);
//        Arrays.sort(sidesOfTriangle);
//        if(Math.pow(sidesOfTriangle[sidesOfTriangle.length-1],2)== Math.pow(sidesOfTriangle[0],2)+Math.pow(sidesOfTriangle[1],2)){
//            System.out.println("Right Angle Triangle");
//        }else{
//            System.out.println("Not Right Angle Triangle");
//        }



    }
}
   class Triangle{
    int sideOne;
    int sideTwo;
    int sideThree;

    Triangle (int sideOne, int sideTwo, int sideThree){
        if(sideOne>0 && sideTwo>0 && sideThree>0) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }
    }

}
