public class Stack_permutation {
    
}



class Solution {//amazon + microsoft //gfg
    //https://www.geeksforgeeks.org/problems/stack-permutations/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
    
    
    
    // public static int isStackPermutation(int n, int[] ip, int[] op) {
    //     // code here
        
    // }

    //how differrent from c++
    //stack defining
    //top is now peek

    //how not different from c++
    //array accress is not for with get function


    public static int isStackPermutation(int n, int[] a, int[] b) 
    {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            st.push(a[i]); 
            
            while (st.size() != 0 && st.peek() == b[j]) {
                st.pop();
                j++;
            }
        }
        
        return (j == n && st.size() == 0) ? 1 : 0; 
    }

}