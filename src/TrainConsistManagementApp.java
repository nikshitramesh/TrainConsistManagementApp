import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    // -------------------- Bogie Class --------------------
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Display method
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 3: Add Bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display Sorted Bogies
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 6: Descending Order (optional for better understanding)
        bogieList.sort((a, b) -> b.capacity - a.capacity);

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 7: Continue Program
        System.out.println("\nSorting completed successfully...");
    }
}