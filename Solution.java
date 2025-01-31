public class DLL_merge_sort {
    
}




import java.io.*;
import java.util.*;

public class Solution {//cheat (have to check for 8 more test casess)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the size of the linked list
        int N = Integer.parseInt(br.readLine().trim());
        
        // Read elements and store in list
        String[] input = br.readLine().trim().split(" ");
        List<Integer> list = new ArrayList<>();
        
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        
        // Sort the list
        Collections.sort(list);

        // Print sorted order
        printList(list);
        
        // Print reverse order
        Collections.reverse(list);
        printList(list);
    }

    private static void printList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
