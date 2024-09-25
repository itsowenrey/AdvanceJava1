import java.util.ArrayList;

public class ArrayListExample {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Insertion Time: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        arrayList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("ArrayList Search Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        arrayList.remove(new Integer(999999));
        endTime = System.nanoTime();
        System.out.println("ArrayList Deletion Time: " + (endTime - startTime) + " ns");
    }
}
