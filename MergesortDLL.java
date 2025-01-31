import java.io.*;
import java.util.*;

public class MergesortDLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the list
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Read elements into ArrayList
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        // Sort the list
        Collections.sort(list);

        // Print sorted list in ascending order
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print sorted list in descending order
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
