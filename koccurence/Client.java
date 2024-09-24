package TCTquestions.koccurence;

import java.util.ArrayList;
import java.util.Arrays;


public class Client {
    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1,2,2,3,3));
        System.out.println(Solution.solve(A,B,C));
    }
}
