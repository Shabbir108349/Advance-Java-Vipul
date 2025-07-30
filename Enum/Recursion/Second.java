package Recursion;

public class Second {
    public static int first = -1;
    public static int last = -1;
    static void Occurance(String s, char element, int index){
        if(index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = s.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        Occurance(s,element,index+1);
    }
    public static void main(String[] args) {
        String s = "aabbccdderrass";
        char element = 'a';
        Occurance(s,element,0);
    }
}
