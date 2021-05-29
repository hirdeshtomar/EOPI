package com.eopi.problems.arrays;


import java.util.Collections;
import java.util.List;

/**
 * @author Hirdesh Tomar (h0t00rj)
 */
public class DutchNationalFlagProblem {

    public enum Color {RED, WHITE, BLUE}

    public DutchNationalFlagProblem() {
    }

    public static void dutchFlagPartition(int pivotIndex, List<Color> A) {
        Color pivot  = A.get(pivotIndex);
        /*
        Keep the following invariants druing partitioning:
        * bottom group: A.subList(0,smaller).
        * middle group: A.subList(smaller,equal).
        * unclassified group: A.subList(equal,larger).
        * top group: A.subList(larger, A.size()).
         */

        int smaller =0;
        int equal =0;
        int larger = A.size();
        // Keep iterating as long as there is an unclassified element.
        while(equal < larger) {
            if(A.get(equal).ordinal() < pivot.ordinal()){
                Collections.swap(A,smaller++, equal++);
            } else if (A.get(equal).ordinal() == pivot.ordinal()){
                ++equal;
            } else {
                Collections.swap(A, equal, --larger);
            }
        }
    }
}
