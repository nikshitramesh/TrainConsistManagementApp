import java.util.*;
import java.util.stream.*;

// -------------------- Main Class --------------------
public class TrainConsistManagementApp {

    // -------------------- Bogie Class --------------------
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create Large Dataset
        List<Bogie> bogieList = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogieList.add(new Bogie("Bogie" + i, (i % 100) + 1));
        }

        // ---------------- LOOP-BASED FILTERING ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM-BASED FILTERING ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList
                .stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("\nFiltered Bogies Count:");
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time (in nanoseconds):");
        System.out.println("Loop Time   : " + loopTime);
        System.out.println("Stream Time : " + streamTime);

        // Optional comparison
        if (loopTime < streamTime) {
            System.out.println("\nLoop is faster in this run ⚡");
        } else {
            System.out.println("\nStream is faster in this run ⚡");
        }

        System.out.println("\nPerformance comparison completed...");
    }
}