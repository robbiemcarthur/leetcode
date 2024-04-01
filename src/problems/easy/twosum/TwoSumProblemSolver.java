package problems.easy.twosum;

import java.util.HashMap;

public class TwoSumProblemSolver {


    public static int[] inBigOOfNSquared(int[] nums, int target) {
        return usingMap(nums, target);
    }
    public static int[] inBigOOfN(int[] nums, int target) {
        return usingForLoop(nums, target);
    }

    private static int[] usingMap(int[] nums, int target) {
        HashMap<Integer, Integer> valueIndiceMap = getValueIndiceMap(nums);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (valueIndiceMap.containsKey(complement) && valueIndiceMap.get(complement) != i) {
                return new int[]{i, valueIndiceMap.get(complement)};
            }
        }
        return null;
    }

    private static HashMap<Integer, Integer> getValueIndiceMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        return map;
    }

    private static int[] usingForLoop(int[] nums, int target) {
        for (int firstIndice = 0; firstIndice < nums.length; firstIndice++) {
            for(int secondIndice = firstIndice + 1; secondIndice < nums.length; secondIndice++){
                if (doesSumEqualTarget(nums[firstIndice], nums[secondIndice], target)) {
                    return new int[] { firstIndice, secondIndice };
                }
            }
        }
        return new int[] {};
    }

    private static boolean doesSumEqualTarget(int numberOne, int numberTwo, int target) {
        final int total = numberOne + numberTwo;
        return total == target;
    }
}
