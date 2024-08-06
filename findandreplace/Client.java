package TCTquestions.findandreplace;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        /*String A = "e[exe]c";
        String B = "e";
        String C = "g";
        System.out.println(Solution.solve(A,B,C));*/
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(23,35,6,25,10,34,29,13,35,1,6,7));
        System.out.println(Solution.xorSum(A));

    }
}
