package TCTquestions.countnumbers;

import java.util.ArrayList;

public class Solution {
    public int countMinSquares(int A) {
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(0);
        for (int i=1; i<A+1; i++) {
            dp.add(i);
            for (int x=1; x*x <= i; x++){
                dp.set(i,Math.min(dp.get(i),dp.get(i-(x*x))+1));
            }
        }
        return dp.get(A);
    }
}
