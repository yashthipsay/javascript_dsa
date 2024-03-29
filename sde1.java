import java.util.*;

public class sde1 {
    public static List <Integer> nextGreaterPermutation(List <Integer> A) {
        int n = A.size(); //size of the array

        // Step 1: Find the break point:
        int ind = -1; // break point
        for(int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i+1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist
        if(ind == -1) {
            // reverse the whole array
            Collections.reverse(A);
            return A;
        }

        for (int i = n-1;i>ind; i--) {
            if(A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Reverse the right half of the array
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }
    
}