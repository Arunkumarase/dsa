package TCTquestions.petrolprices;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,6,3,4,2,1));
        int B = 2;
        System.out.println(new Solution().getMinPrice(A,B));
    }
}
