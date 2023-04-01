import java.util.HashMap;

public class SetViewOfMap {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(1,"obj1");
        map.put(2,"obj2");
        map.put(3,"obj3");
        map.put(4,"obj4");
        map.put(5,"obj5");

        System.out.println("HashMap view:"+map);
        System.out.println("Collection view of HashMap:"+map.keySet());
    }
}

