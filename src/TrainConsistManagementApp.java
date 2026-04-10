import java.util.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display Bogies (READ)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 5: Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Step 6: Check Existence (SEARCH)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Step 7: Final State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        // Step 8: Continue Program
        System.out.println("\nSystem ready for further operations...");
    }
}