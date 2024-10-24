import java.util.Scanner;

public class DistributeInCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of items to distribute
        System.out.print("Enter the number of items (n): ");
        int n = sc.nextInt();

        // Input: number of slots in the cycle
        System.out.print("Enter the number of slots (k): ");
        int k = sc.nextInt();

        // Distribute in a cycle
        for (int i = 1; i <= n; i++) {
            int slot = (i - 1) % k + 1;  // Compute slot in cycle
            System.out.println("Item " + i + " goes into slot " + slot);
        }

        sc.close();
    }
}
