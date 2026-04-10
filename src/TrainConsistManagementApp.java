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

        // Getter for grouping
        String getName() {
            return name;
        }

        // Display
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
        bogieList.add(new Bogie("Sleeper", 72));   // duplicate type
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 56));  // duplicate type

        // Step 3: Display Original List
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Step 4: Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies = bogieList
                .stream()
                .collect(Collectors.groupingBy(b -> b.getName()));

        // Step 5: Display Grouped Data
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // Step 6: Continue Program
        System.out.println("\nGrouping completed successfully...");
    }
}