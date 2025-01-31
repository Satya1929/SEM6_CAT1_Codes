import java.util.*;

public class Celebrity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of people
        int n = sc.nextInt();
        int[][] M = new int[n][n];

        // Read the acquaintance matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        // Arrays to track how many people each person knows and who knows them
        int[] iKnow = new int[n];          // Count of people i knows
        int[] othersKnowMe = new int[n];   // Count of people who know i

        // Traverse the matrix and populate the arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == 1) {
                    iKnow[i]++;
                    othersKnowMe[j]++;
                }
            }
        }

        // Find a potential celebrity
        int celebrity = -1;
        for (int i = 0; i < n; i++) {
            if (iKnow[i] == 0 && othersKnowMe[i] == n - 1) { // Celebrity conditions
                celebrity = i;
                break;
            }
        }

        // Output the result
        if (celebrity == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println(celebrity);
        }

    }
}
