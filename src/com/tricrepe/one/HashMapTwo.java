package com.tricrepe.one;
import java.util.HashMap;
import java.util.Map;

public class HashMapTwo {
    public static int[] twoSums(int[] arr, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i <arr.length ; i++) {
            int complement = target-arr[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }
        }
    throw new IllegalArgumentException("No solutions");
    }
}