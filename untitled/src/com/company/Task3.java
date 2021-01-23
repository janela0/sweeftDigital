package com.company;

import java.util.Arrays;

public class Task3 {
    static int notContains(int[] array) {
        Arrays.sort(array);
        array = Arrays.stream(array).filter(x -> x > 0).toArray();
        if(array.length < 1) return 1;
        for(int i = 1; array.length + 1> i; i ++){
            if(array[i - 1] != i) return i;
            i++;
        }
        return array[array.length-1] + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-11, -12, 1, 6, 2, -3, 0, 3};
        System.out.println(notContains(arr));
    }
}

