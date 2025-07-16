package AdvanceTopic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void printList(ArrayList<?> list){
        for(Object e: list){

            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printList(list);
    }
}
