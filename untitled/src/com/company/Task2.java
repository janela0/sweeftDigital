package com.company;

public class Task2 {
   static int coinAmount(int money){
        int[] intArray = new int[]{ 50, 20, 15, 10, 5, 1 };
        int amount = 0;

        for (int v:
             intArray) {
            amount += money / v;
            money = money % v;
        }
        return amount;
    }

    public static void main(String[] args) {
        int money = 199;
        System.out.println(coinAmount(money));
    }
}
