import java.util.HashSet;

public class RemoveAllFromHashset {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("HashSet:"+set);
        set.removeAll(set);
        System.out.println("HashSet after removeAll operation:"+set);

    }

}
