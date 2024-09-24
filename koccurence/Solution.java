package TCTquestions.koccurence;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solve(int A, int B, ArrayList<Integer> C){
        Map<Integer, Integer> store = new HashMap<>();
        int ans = 0;
        for (int i:C){
            store.put(i,store.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry :store.entrySet()){
            if (entry.getValue() == B) {
                ans += entry.getKey();
                ans %= Math.pow(10,9) + 7;
            }
        }
        return ans;
    }
}
