package com.masai.exceptation;

public class Execptation_01 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;

        try {
            c=a/b;

            System.out.println(c);
        } catch (Exception e){
            System.out.println("You can not divide by zero");
        }

    }
}
