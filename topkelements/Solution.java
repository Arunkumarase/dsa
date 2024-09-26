package TCTquestions.topkelements;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class Solution {

    public static int[] getTopElements(ArrayList<Integer> arrayList, int c){
        //Queue<Integer> priorityQueue = new PriorityQueue<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : arrayList) {
            frequency.put(i,frequency.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> arrayFreq = new ArrayList<>(frequency.entrySet());
        arrayFreq.sort((a,b) -> {
            int valueCompare = b.getValue().compareTo(a.getValue());
            return (valueCompare != 0) ? valueCompare : b.getKey().compareTo(a.getKey());
                }
        );
        //System.out.println(arrayFreq);
        int[] ans = new int[c];
        for (int i = 0; i < c; i++) {
            ans[i] = arrayFreq.get(i).getKey();
            //System.out.println(arrayFreq.get(i).getKey());
        }
        Arrays.sort(ans);
        return ans;
    }


}
