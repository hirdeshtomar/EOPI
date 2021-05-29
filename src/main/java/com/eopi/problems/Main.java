package com.eopi.problems;

import com.eopi.problems.arrays.DutchNationalFlagProblem;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hirdesh Tomar (h0t00rj)
 */
public class Main {
    public static void main(String[] args){
        List<DutchNationalFlagProblem.Color> colors = Arrays.asList(
                DutchNationalFlagProblem.Color.BLUE,
                DutchNationalFlagProblem.Color.WHITE,
                DutchNationalFlagProblem.Color.RED,
                DutchNationalFlagProblem.Color.RED,
                DutchNationalFlagProblem.Color.BLUE);

        DutchNationalFlagProblem.dutchFlagPartition(1, colors);
    }
}
