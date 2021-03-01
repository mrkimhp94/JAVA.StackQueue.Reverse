package com.company;

import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] arr ={1,2,3,4,5,6,7,8};
        for (int j : arr) {
            stack.push(j);
        }
        for (int i = 0; i < arr.length; i++) {
            stack.pop();
            System.out.print(arr[i]+" ");
        }

    }
}
