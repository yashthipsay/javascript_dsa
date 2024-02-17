import java.util.*;

public class sde2 {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        // check all possible triplets
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                for(int k = j+1; k<n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
