import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for Bogie IDs (Unique Storage)
        Set<String> bogieIds = new HashSet<>();

        // Step 3: Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Step 4: Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Step 5: Show Count
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        // Step 6: Continue Program
        System.out.println("\nSystem ensures no duplicate bogie IDs...");
    }
}