public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[1000000];

        // Insertion
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long endTime = System.nanoTime();
        System.out.println("Array Insertion Time: " + (endTime - startTime) + " ns");

        // Search
        startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 999999) break;
        }
        endTime = System.nanoTime();
        System.out.println("Array Search Time: " + (endTime - startTime) + " ns");

        // Deletion (simulated by setting to a default value)
        startTime = System.nanoTime();
        array[999999] = 0;
        endTime = System.nanoTime();
        System.out.println("Array Deletion Time: " + (endTime - startTime) + " ns");
    }
}
