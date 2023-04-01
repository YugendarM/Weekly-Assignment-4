import java.util.TreeSet;

public class LastElementTreeSet {
    public static void lastElement(){
        TreeSet ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(7);

        System.out.println("Last element of the TreeSet is: "+ts.last());
    }

    public static void main(String[] args) {
        lastElement();
    }

}
