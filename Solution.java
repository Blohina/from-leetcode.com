package com.company;
import java.util.*;

public class Solution {
    public  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                index = map.get(target-nums[i]);
                if (index != i) {
                    return new int[]{i, index};
                }
            }
        }
        throw new IllegalArgumentException("No  solution");
    }
}
