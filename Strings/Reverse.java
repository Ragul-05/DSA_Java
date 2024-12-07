package Strings;

import java.util.*;

class Reverse {
    static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
      
        
        for (int i = 0; i < s.length(); i++)
            st.push(s.charAt(i));

        StringBuilder res = new StringBuilder();
      
        
        for (int i = 0; i < s.length(); i++)
            res.append(st.pop());
        
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Lets begin";
        System.out.println(reverseString(s));
    }
}