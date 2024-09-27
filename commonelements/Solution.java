package TCTquestions.commonelements;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b){
        HashMap<Integer, Integer> hashMapa = new HashMap<>();
        HashMap<Integer, Integer> hashMapb = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : a){
            hashMapa.put(i,hashMapa.getOrDefault(i,0)+1);
        }
        for (int i : b){
            hashMapb.put(i,hashMapb.getOrDefault(i,0)+1);
        }

        for (int i : hashMapa.keySet()){
            if (hashMapb.containsKey(i)){
                for (int j = 0; j<Math.min(hashMapa.get(i),hashMapb.get(i)); j++){
                    answer.add(i);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,2,3,4,5,78,6,4,2,4,6,8,9,0,5,4,3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(9,6,43,6,89,4,2,7,9,6,4,0));
        System.out.println(new TCTquestions.commonelements.Solution().solve(a,b));
    }
}
