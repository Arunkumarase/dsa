package TCTquestions.equilibrium;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefSum = new ArrayList<>();
        prefSum.add(A.get(0));
        int n = A.size();
        for (int i = 1; i < A.size(); i++) {
            prefSum.add(prefSum.get(i-1) + A.get(i));
        }

        for (int i = 0; i < A.size(); i++) {
            if (i==0) {
                if (prefSum.get(n-1) - prefSum.get(0) == 0) {
                    return i;
                }
            } else if (i == n-1) {
                if (prefSum.get(n-2) == 0) {
                    return i;
                }
            } else {
                if (prefSum.get(i-1) == prefSum.get(n-1) - prefSum.get(i)) {
                    return i;
                }
            }

        }
        return -1;
    }
}
