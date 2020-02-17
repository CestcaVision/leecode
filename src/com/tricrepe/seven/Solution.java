package com.tricrepe.seven;

public class Solution {
    public static int reverse(int x){
        int rex = 0;
        while (x!=0){
            int pop = x%10;  //数位反转
            if(rex>Integer.MAX_VALUE/10||(rex==Integer.MAX_VALUE/10&&pop>7)){
                return 0;
            }else if(rex<Integer.MIN_VALUE/10||(rex==Integer.MIN_VALUE/10&&pop<-8)){
                return 0;
            }
            rex = rex*10+pop;
            x = x/10;
        }
        return rex;
    }
}
