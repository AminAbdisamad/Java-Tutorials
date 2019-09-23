package com.Aminux;

public class Arrays {
    public static void main(String[] args){
//        Declaring an array with two values
        int[] value = new int [100]; // this array will store 100 elements
        value[0] = 10;
        value[99] = 1000;
        System.out.println(value[0]+" "+value[99]);
//        Creating array of strings
        String[] users = new String[100];
        users[0] = "Aminux";
        users[1] = "Ali";
        users[2] = "Hassan";
        users[99] = "Geedi";
        System.out.println(users[0]+users[1]+users[2]+users[99]);
//another way of declaring string array
        String[] myName = new String[]{"My","Name","is","Aminux"};



    }
}
