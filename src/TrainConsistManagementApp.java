import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet (Ordered + Unique)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add Bogies (Insertion Order Maintained)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt Duplicate Insertion
        trainFormation.add("Sleeper"); // duplicate (will be ignored)

        // Step 5: Display Final Formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Step 6: Show Count
        System.out.println("\nTotal Bogies: " + trainFormation.size());

        // Step 7: Continue Program
        System.out.println("\nInsertion order preserved & duplicates prevented...");
    }
}