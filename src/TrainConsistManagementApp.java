import java.util.*;
import java.util.stream.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    // -------------------- Goods Bogie Class --------------------
    static class GoodsBogie {
        String type;   // Cylindrical, Open, Box
        String cargo;  // Petroleum, Coal, Grain

        // Constructor
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return type + " Bogie carrying " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create Goods Bogie List
        List<GoodsBogie> bogieList = new ArrayList<>();

        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogieList.add(new GoodsBogie("Open", "Coal"));             // allowed
        bogieList.add(new GoodsBogie("Box", "Grain"));             // allowed
        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Step 3: Display Bogies
        System.out.println("\nGoods Bogies:");
        bogieList.forEach(System.out::println);

        // Step 4: Safety Validation using Stream
        boolean isSafe = bogieList
                .stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 5: Display Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        // Step 6: Continue Program
        System.out.println("\nSafety validation completed successfully...");
    }
}