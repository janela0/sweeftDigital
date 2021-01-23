package com.company.Task6;

public class Task6 {
    public static void main(String[] args) {
        DataStructure data = new DataStructure();
        data.addData(5);
        data.addData(2);
        data.addData(6);
        data.addData(12);
        System.out.println(data.toString());

        data.deleteData(2);
        System.out.println(data.toString());

        data.addData(1);
        System.out.println(data.toString());


        data.deleteData(12);
        System.out.println(data.toString());

    }
}
