import java.io.*;
import java.util.*;

public class MinStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Skipping dummy input
        int dummy = sc.nextInt();
        int n = sc.nextInt();

        // Store input in an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Sort the list to get the minimum
        Collections.sort(list);

        // Print the first element after sorting (which is the minimum)
        System.out.println(list.get(0));
    }
}
