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







public class Solution { //own typed // same as above

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        // int a = sc.nextInt() ; //debug
        // System.out.println(a) ; //debug
        
        int dum = sc.nextInt() ;
        int n = sc.nextInt() ;
        
        ArrayList<Integer> l = new ArrayList<>() ;
        for(int i=0 ; i<n ;i++)
        {
            l.add(sc.nextInt()) ;
        }
        
        // for(Integer a : l) System.out.println(a) ;//debug
        
        Collections.sort(l) ;
        
        // for(Integer a : l) System.out.println(a) ;//debug
        
        System.out.println(l.get(0)) ;
        
    }
}