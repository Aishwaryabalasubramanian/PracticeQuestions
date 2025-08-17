package Practice.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Asteroidcollision {
    public static void main(String[] args) {
        int[] num ={-2,-2,-2,-2};
        System.out.println(Arrays.toString(asteroidCollision(num)));

    }
    public  static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();


        for(int asteroid: asteroids){



            if(asteroid>0){
                st.push(asteroid);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 &&st.peek()<Math.abs(asteroid)){
                    st.pop();
                }
                if(!st.isEmpty()&& st.peek() != asteroid &&  Math.abs(st.peek())-Math.abs(asteroid)==0){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroid);
                }
            }
        }
        List<Integer> list= new ArrayList<>();
        while(!st.isEmpty()){
            list.add(0,st.pop());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
