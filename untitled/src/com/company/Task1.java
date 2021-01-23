package com.company;

public class Task1 {

    static Boolean isPalindrome(String text){
        text = text.replace(" ", "");
        if(text.length() <= 1){
            return false;
        }
        int last = text.length() - 1;
        for(int i = 0; i< last; i++){
            if(text.charAt(i) != text.charAt(last)) return false;
            last --;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "a kaka";
        String b = "";
        if(isPalindrome(a)){
            System.out.println(a + " is palindrome");
        }else
            System.out.println(a + " is not palindrome");

        if(isPalindrome(b)){
            System.out.println(b + " is palindrome");
        }else
            System.out.println(b + " is not palindrome");
    }
}
