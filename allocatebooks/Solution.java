package TCTquestions.allocatebooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public int countOfStudents(int pages, ArrayList<Integer> A) {
        int count = 1;
        int rempages = pages;
        for (int i: A) {
            if (pages < i) {
                return -1;
            } else {
                if (rempages < i) {
                    count += 1;
                    rempages = pages - i;
                } else {
                    rempages -= i;
                }
            }
        }
        return count;
    }
    public int books(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int l = A.get(0);
        int r = Collections.max(A);
        int mid = 0;
        int students;
        while (l<=r) {
            mid = l + (r-l)/2;
            students = countOfStudents(mid, A);
            if ((students == B) && countOfStudents(mid-1, A) > B) {
                return mid;
            }
            if (students <= B) {
                //ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(53,77,8,28,33,98,81,35,13,65,14,63,36,25,69));
        System.out.println(new Solution().books(A,12));
    }
}
