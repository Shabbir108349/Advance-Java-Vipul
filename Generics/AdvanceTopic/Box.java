package AdvanceTopic;

public class Box {


    public <T> Box(T value){

    }

    public <T> void printArray(T[] array){
        for(T e : array){
            System.out.println(e);
        }
    }

    public <T> void display(T value){
        System.out.println("The Generic is "+value);
    }

    public void display(int value){
        System.out.println("The Integer is : "+value);
    }

}
