import java.util.HashSet;

public class CompareTwoHashSets {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(90);
        hs1.add(40);
        hs1.add(70);

        HashSet hs2 = new HashSet<>();
        hs2.add(10);
        hs2.add(20);
        hs2.add(30);
        hs2.add(40);
        hs2.add(50);

        System.out.println("HashSet1:"+hs1);
        System.out.println("HashSet2:"+hs2);
        if(hs1.equals(hs2)){
            System.out.println("Both the Hashsets are equal");
        }
        else{
            System.out.println("Both the Hashsets are not equal");
        }
    }
}
