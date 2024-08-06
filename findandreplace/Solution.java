package TCTquestions.findandreplace;

import java.util.ArrayList;

public class Solution {

    public static int xorSum(ArrayList<Integer> A){
        int n = A.size();
        int half= A.size()/2;
        int ans = 0;
        for(int i=1;i<=half;i++){
            ans += A.get(n-i)^A.get(half-i);
        }
        return ans;
    }
    public static String solve(String A,String B,String C){
        String ans = "";
        for (int i=0; i<A.length(); i++){
            ans += A.charAt(i);
            if (A.charAt(i) == '[') {
                i++;
                while (true) {
                    if (A.charAt(i) == ']'){
                        ans += A.charAt(i);
                        break;
                    }
                    if (A.charAt(i) == B.charAt(0)) {
                        ans += C.charAt(0);
                    } else {
                        ans += A.charAt(i);
                    }
                    i ++;
                }
            }

        }
        return ans;

    }
}
