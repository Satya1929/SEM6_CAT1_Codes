import java.io.*;
import java.util.*;

public class Bitonic_DLL_Sort {//cheat

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline after the integer input

        for (int _i = 0; _i < n; _i++) {

            // Read the current line of input and split it into tokens (numbers as strings)
            String[] tokens = sc.nextLine().split(" ");
            
            // Create an ArrayList to store valid integers
            ArrayList<Integer> a = new ArrayList<>();

            // Traverse each token in the current line
            for (String token : tokens) {
                // Ignore the "-1" marker; add valid integers to the list
                if (!token.equals("-1")) {
                    a.add(Integer.parseInt(token));
                }
            }

            // Sort the list in increasing order
            Collections.sort(a);

            // Print the sorted list elements
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
            // Move to the next line for the next test case output
            System.out.println("");
        }
    }
}








public class Solution //own typed (same code as above)
//debugging see
{
    public static void main(String[] args)
    {
        // System.out.println("satya") ;
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        sc.nextLine(); //consume newline after integer input
        
        for(int i=0 ; i<n ; i++) // for each line of input
        {
            String[] tokens = sc.nextLine().split(" ") ;
            ArrayList<Integer> l = new ArrayList<>();
            
            for(String t : tokens)
            {
                if(!t.equals("-1"))
                {
                    l.add(Integer.parseInt(t));
                }
            }
        
            // for(String s : tokens) System.out.println(s) ; //inputs debug
            // for(Integer s : l) System.out.println(s) ; //inputs debug
            // System.out.println(" one line done") ; // debug
            
            //now code
            
            Collections.sort(l) ; 
            
            // for(Integer s : l) System.out.println(s) ; //inputs debug
            // System.out.println(" one line sort done") ; 

            for(Integer s : l)
            {
                System.out.print(s) ;
                System.out.print(" ") ;
            }

            System.out.println();
            
        }
    }
       
    
}