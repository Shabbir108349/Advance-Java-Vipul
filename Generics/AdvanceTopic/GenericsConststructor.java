package AdvanceTopic;

public class GenericsConststructor {
    public static void main(String[] args) {
        /*Box b = new Box("Shabbir");
        String [] s = {"Shabbir","Annie","Suraiya","Abdullah"};
        b.printArray(s);
       Integer [] c = {1,2,3};
       b.printArray(c);
       Double [] d = {2.22, 3.0,4.22, 4.0, 6.0};
       b.printArray(d);*/

        Box b1 = new Box("Annie");
        b1.display(2);
        b1.display("Shabbir");
        b1.display(2f);
        b1.display(2.0);

    }
}
