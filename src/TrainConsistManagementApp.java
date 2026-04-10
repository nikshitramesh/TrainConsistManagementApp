import java.util.*;
import java.util.stream.*;

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

        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Second Sitting", 90));

        // Step 3: Display Bogies
        System.out.println("\nBogie List:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Stream Aggregation (Total Capacity)
        int totalCapacity = bogieList
                .stream()
                .map(b -> b.capacity)        // Extract capacity
                .reduce(0, Integer::sum);   // Sum all values

        // Step 5: Display Total
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Step 6: Continue Program
        System.out.println("\nAggregation completed successfully...");
    }
}