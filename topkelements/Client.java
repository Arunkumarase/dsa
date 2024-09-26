package TCTquestions.topkelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3,3,3,1,2,3,1,2,4,5,6));
        int b = 2;
        //Collections.sort(a);
        System.out.println(Solution.getTopElements(a,b));
    }
}
