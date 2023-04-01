import java.util.LinkedList;

public class ElementInLinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println("LinkedList:"+ll);

        if(ll.contains(5)){
            System.out.println("Element 5 exist in the LinkedList");
        }
        else {
            System.out.println("Given element does not exist in the LinkedList");
        }
    }
}
