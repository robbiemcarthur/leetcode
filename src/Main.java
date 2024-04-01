import problems.easy.twosum.TwoSumProblemSolver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
           Easy problems
          */

        final int[] expectedResult = new int[] {1, 7};

        final int[] input = new int[] { 2, 60, 90, 113, 71, 11, 63, 64, 158 };

        int target = 124;

        int[] twoSumInBigOOfNSquaredResult = TwoSumProblemSolver.inBigOOfNSquared(input, target);

        System.out.println("In O(n) \nExpected Result: " + Arrays.toString(expectedResult) + "\nActual Result: " + Arrays.toString(twoSumInBigOOfNSquaredResult));

        int[] twoSumInBigOOfNResult = TwoSumProblemSolver.inBigOOfN(input, target);

        System.out.println("In O(n^2) \nExpected Result: " + Arrays.toString(expectedResult) + "\nActual Result: " + Arrays.toString(twoSumInBigOOfNResult));
    }
}