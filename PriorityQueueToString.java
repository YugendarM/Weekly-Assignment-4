import java.util.PriorityQueue;

public class PriorityQueueToString {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add("Shah");
        pq.add("Vimal");
        pq.add("Arun");
        pq.add("Karthi");
        pq.add("Steve");

        System.out.println("Priority queue:"+pq);

        String str = pq.toString();
        System.out.println("String Representation:"+str);
    }
}
