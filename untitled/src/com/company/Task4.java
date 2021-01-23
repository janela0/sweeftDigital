package com.company;

public class Task4 {
    static Boolean isProperly(String text) {
        int countLeft = 0;
        for (char v : text.toCharArray()) {
            if (v == '(') {
                countLeft++;
            } else {
                if (countLeft > 0)
                    countLeft--;
                else
                    return false;
            }
        }
        return countLeft == 0;
    }

    public static void main(String[] args) {
        String a = "(()()()((())))";
        if (isProperly(a))
            System.out.println("is properly");
        else
            System.out.println("is not properly");
    }
}
