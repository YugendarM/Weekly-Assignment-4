import java.util.Scanner;
import java.util.TreeMap;

public class Q11 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(10,"violet");
        map.put(25,"indigo");
        map.put(37,"blue");
        map.put(48,"green");
        map.put(59,"yellow");
        map.put(61,"orange");
        map.put(73,"red");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search:");
        int n = sc.nextInt();

        System.out.println("The least key-value mapping greater than or equal to the given key is "+map.ceilingEntry(n));
    }
}
