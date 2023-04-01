import java.util.LinkedList;

public class FirstElementOfLinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        System.out.println("LinkedList:"+ll);

        System.out.println("First Element is:"+ll.getFirst());
    }
}
