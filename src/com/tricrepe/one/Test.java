package com.tricrepe.one;


public class Test {
    public static void main(String[] args) {
        int[] question = new int[]{3,-2,5,13,43};
        int[] answer= HashMapOne.twoSums(question,16);

            System.out.println(answer[0]);
            System.out.println(answer[1]);
            System.out.println(question[answer[0]]);
        System.out.println(question[answer[1]]);
    }
}
