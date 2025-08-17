import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }


    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        int left = 0,
                right = arr[0].length - 1,
                down = arr.length - 1,
                top = 0,
                i,k;
        list.add(arr[0][0]);
        while (left <= right || top <= down) {;
            k=left+1;
            for (i = k; i <=right; i++) {
                list.add(arr[left][i]);
            }
            k=top+1;
            for (i = k; i < down; i++) {
                list.add(arr[i][down]);
            }
            k=right-1;
            for (i = k; i > left; i--) {
                list.add(arr[right][i]);
            }
            k=down-1;
            for (i = k; i > top; i--) {
                list.add(arr[i][top]);
            }
            left++;
            right--;
            down--;
            top++;

        }
        return list;

    }
}