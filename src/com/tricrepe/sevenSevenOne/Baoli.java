package com.tricrepe.sevenSevenOne;

public class Baoli {
    public static int check(String J, String S){
        int answer=0;
        for (char s:S.toCharArray()){
            for (char j:J.toCharArray()){
                if(s==j){
                    answer++;
                }
            }
        }
        return answer;
    }
}
