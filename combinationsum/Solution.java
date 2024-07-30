package TCTquestions.combinationsum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public static void recursiveFunc(ArrayList<Integer> A,int sum, ArrayList<Integer> comb, int index) {
        if (index == A.size() || sum < 0) {
            return;
        }
        if (sum == 0) {
            Collections.sort(comb);
            if (!ans.contains(comb)) {
                ans.add((ArrayList<Integer>) comb.clone());
            }
        }
        recursiveFunc(A,sum,comb,index+1);
        comb.add(A.get(index));
        recursiveFunc(A,sum-A.get(index),comb,index+1);
        comb.remove(comb.size()-1);
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A , int B) {

        ArrayList<Integer> comb = new ArrayList<>();
        Collections.sort(A);
        recursiveFunc(A,B,comb,0);
        return ans;

    }
}
