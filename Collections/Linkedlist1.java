import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(6);
        boolean offer = list.offer(11);
        System.out.println(offer);
        list.sort(null);
        System.out.println(list);
        LinkedList<Integer> reversed = list.reversed();
        Integer e = list.element();
        System.out.println(e);
        System.out.println(reversed);
        List<String> sl = new LinkedList<>();

    }
}
