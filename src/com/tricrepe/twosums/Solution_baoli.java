package com.tricrepe.twosums;

public class Solution_baoli {
    public static int[] twoSums(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(target==arr[i]+arr[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sums solutions");
    }
}
