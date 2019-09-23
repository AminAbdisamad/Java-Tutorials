package com.Aminux;

class Human {
     private String Name;
     private int age;
     private double height;
     private String eyeColor;
//    In java constructor Methods always same name as the class


     Human(String name, int age, double height, String eyeColor) {
        this.Name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    void speak(){
        System.out.println("Hi, My name is "+Name+" I'm "+age+ " "+height+ " tall And I have "+eyeColor+" eyes" );
    }
//    public void walk(){
//        System.out.println("Walking...");
//    }
//    public void eat(){
//        System.out.println("Eating..");
//    }

}

