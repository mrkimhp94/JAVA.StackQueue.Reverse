package com.company;
import java.util.Stack;

public class ReverseChar {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String str = "hello world";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}