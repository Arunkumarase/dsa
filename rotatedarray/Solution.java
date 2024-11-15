package TCTquestions.rotatedarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
        int l = 0;
        int r = A.size()-1;
        int ans = 0;
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (A.get(mid) == B) {
                return mid;
            }
            if (A.get(mid) >= A.get(l)) {
                if (B <= A.get(mid) && B >= A.get(l)) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (B >= A.get(mid) && B <= A.get(r)) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(4,5,6,7,0,1,2,3));
        System.out.println(new Solution().search(A,0));
    }
}
