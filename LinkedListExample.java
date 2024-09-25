import java.util.LinkedList;

public class LinkedListExample {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("LinkedList Insertion Time: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        linkedList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("LinkedList Search Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        linkedList.remove(new Integer(999999));
        endTime = System.nanoTime();
        System.out.println("LinkedList Deletion Time: " + (endTime - startTime) + " ns");
    }
}
