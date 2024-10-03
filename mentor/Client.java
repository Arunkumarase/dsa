package TCTquestions.mentor;



import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(16));
        int B = 2;
        System.out.println(new Solution().getMentorList(A));
    }
}
