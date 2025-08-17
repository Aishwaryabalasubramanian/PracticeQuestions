package Patterns;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = removeDuplicateLetters("cbadb");

    }
    public static  String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];
        int i;
        boolean[] lastSeen = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(i = 0; i <s.length(); i++){

            lastIndex[s.charAt(i)-'a']=i;
        }

        for(i = 0;i<s.length();i++){

            if(lastSeen[s.charAt(i)-'a'])
                continue;

            while(!st.isEmpty() && st.peek()>s.charAt(i) && i <lastIndex[st.peek() - 'a']){
                lastSeen[st.peek()-'a']=false;
                st.pop();

            }
            lastSeen[s.charAt(i)-'a']=true;
            st.push(s.charAt(i));

        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        // Reverse the result since stack pops in LIFO order
        return result.reverse().toString();


    }
}

