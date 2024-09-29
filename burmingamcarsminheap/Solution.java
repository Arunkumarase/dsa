package TCTquestions.burmingamcarsminheap;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> a,int b){
        int i = 0;
        int j = b-1;
        int n = a.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j = b-1; j<n; j++){
            while (j-i+1>b){
                i += 1;
            }
            int minValue = 0;
            while (i<=j){
                if (a.get(i) < 0){
                    ans.add(a.get(i));
                    break;
                }
                i+=1;
            }
            if (i>j){
                ans.add(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,-2,0,3,4,-5,6));
        System.out.println(Solution.solve(a,2));
    }
}
