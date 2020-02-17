package com.tricrepe.sevenSevenOne;

import java.util.HashSet;
import java.util.Set;

public class HashSetOne {
    public static int check(String J,String S){
        Set<Character> Jset = new HashSet<>();
        for(char j: J.toCharArray()){
            Jset.add(j);
        }
        int answer = 0;
        for(char s: S.toCharArray()){
            if(Jset.contains(s)){
                answer++;
            }
        }
        return  answer;
    }
}
