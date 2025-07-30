package com.shabbir.Telusko.Others;

import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3);
        v.add(1);
        v.add(4);
        v.add(2);
        v.add(5);
        int capacity = v.capacity();
        System.out.println(capacity);
        List<Integer> l = List.of(1,5,7);
        boolean b = new HashSet<>(v).containsAll(l);
        System.out.println(b);
    }

}
