package TCTquestions.mentor;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> getMentorList(ArrayList<Integer> A){
        int n = A.size();
        ArrayList<Integer> mentorList = new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> indexstack = new Stack<>();

        for(int i=n-1; i<=0; i--){
            while (!indexstack.empty() && A.get(indexstack.peek()) < A.get(i)){
                indexstack.pop();
            }
            if (!indexstack.empty()) {
                mentorList.set(i,indexstack.peek()+1);
            }
            indexstack.push(i);
        }
        return mentorList;
    }
}
