public class Sliding_window_maximum {
    
}


class Solution { //brute
    // gfg 
    //https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


    // Function to find maximum of each subarray of size k
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int j, max;

        // Iterate over each subarray of size k
        for (int i = 0; i <= arr.length - k; i++) {
            max = arr[i]; // Initialize the maximum for the current subarray

            // Iterate through the elements of the current subarray
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max) 
                    max = arr[i + j]; // Update max if a larger element is found
            }

            // Add the maximum of the current subarray to the result
            result.add(max);
        }

        return result;
    }
}



class Solution { //optimal using mean heap to do
    // gfg 
    //https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card



}