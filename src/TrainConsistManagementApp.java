import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashMap (Bogie → Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 3: Insert Bogie-Capacity Data
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Step 4: Display Mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 5: Example Lookup
        String searchBogie = "Sleeper";
        System.out.println("\nCapacity of " + searchBogie + ": "
                + bogieCapacity.get(searchBogie));

        // Step 6: Continue Program
        System.out.println("\nBogie-capacity mapping completed successfully...");
    }
}