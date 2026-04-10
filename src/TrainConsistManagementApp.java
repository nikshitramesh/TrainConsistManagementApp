import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist (Dynamic List)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display Initial State
        System.out.println("\nTrain initialized successfully.");

        // Step 4: Display Bogie Count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Step 5: Continue Program
        System.out.println("\nSystem ready for further operations...");
    }
}