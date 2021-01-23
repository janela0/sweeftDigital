package com.company;

public class Task5 {
    static int countVariants(int stairsCount) {
        if (stairsCount <= 0) return 1;
        int chances = 0;
        if (stairsCount > 1) {
            chances += countVariants(stairsCount - 2);
            chances += countVariants(stairsCount - 1);
        } else {
            chances += countVariants(stairsCount - 1);
        }

        return chances;
    }

    public static void main(String[] args) {
        System.out.println(countVariants(5));
    }

}
