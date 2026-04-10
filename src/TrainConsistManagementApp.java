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

        // Display method
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogies (Reuse UC7 concept)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Second Sitting", 90));

        // Step 3: Display All Bogies
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Stream Filtering (Capacity > 60)
        List<Bogie> filteredBogies = bogieList
                .stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 5: Display Filtered Bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Step 6: Continue Program
        System.out.println("\nFiltering completed successfully...");
    }
}