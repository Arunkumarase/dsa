package TCTquestions.petrolprices;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> getMinPrice(ArrayList<Integer> A, int B){
        int start = 0;
        int end = Math.min(A.size(),B) - 1;
        if (A.size() == 1) {
            return new ArrayList<>(Arrays.asList(1));
        }
        int i = 0;
        int j = 0;
        int petroltofill = 0;
        ArrayList<Integer> petrolcaplist = new ArrayList<>();
        while (j <= end) {
            if (i == j) {
                petroltofill = 1;
            } else {
                while (j - i < B && j <= end && A.get(i) < A.get(j)) {
                    j += 1;
                    petroltofill += 1;
                }
                petrolcaplist.add(petroltofill);
            }


        }
        return petrolcaplist;
    }
}
