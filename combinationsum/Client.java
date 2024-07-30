package TCTquestions.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(8,10,6,11,1,16,8));
        int B = 28;
        System.out.println(Solution.combinationSum(A, B));
    }
}
