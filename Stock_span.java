import java.util.*;

public class Solution {//hackerrank solution
    // https://www.hackerrank.com/contests/vit-bsts302p/challenges/stack-stock-span/submissions/code/1387960291

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of days
        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] span = new int[n];

        // Read the prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Brute force computation for stock span
        for (int i = 0; i < n; i++) {
            span[i] = 1;  // Default span is 1
            for (int j = i - 1; j >= 0; j--) {
                if (prices[j] <= prices[i]) {
                    span[i]++;
                } else {
                    break;
                }
            }
        }

        // Print the span values
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }

    }
}
