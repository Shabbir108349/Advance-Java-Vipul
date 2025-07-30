package com.shabbir.Telusko.Others;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
        s.add(10);
        System.out.println(s.peek());
        System.out.println(s);
//        int capacity = s.capacity();
//        System.out.println(capacity);
    }
}
