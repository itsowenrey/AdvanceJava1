import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet Insertion Time: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        hashSet.contains(999999);
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        hashSet.remove(999999);
        endTime = System.nanoTime();
        System.out.println("HashSet Deletion Time: " + (endTime - startTime) + " ns");
    }
}
