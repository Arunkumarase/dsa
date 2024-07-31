package TCTquestions.contiguouschar;

public class Solution {
    public static int solve(String A, int B, String C){
        int ans = 0;
        char[] ch = A.toCharArray();
        int matchChar = 0;
        for (int i=0; i<A.length(); i++) {
            if (ch[i] == C.charAt(0)) {
                matchChar += 1;
            }
        }
        if (matchChar == 0) {
            return B;
        }
        int startWindow = 0;
        int endWindow = 0;
        int countBadChar = 0;
        for (int i = 0; i<A.length(); i++){
            endWindow ++;
            if (ch[i] != C.charAt(0)) {
                countBadChar ++;
            }
            if (countBadChar == B) {
                break;
            }

        }
        ans = endWindow;
        while (endWindow < A.length()) {
            if (ch[endWindow] != C.charAt(0)) {
                countBadChar++;
            }
            while (countBadChar > B) {
                if (ch[startWindow] != C.charAt(0)) {
                    countBadChar--;
                }
                startWindow++;
            }

            ans = Math.max(ans, endWindow - startWindow + 1);
            endWindow ++;
        }
        return ans;
    }
}
