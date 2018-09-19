package com.company;

public class Main {

    public static void main(String[] args) {

        for (int value= 1; value<=100; value+=2) {
            System.out.println(value);
        }
        for (int count=1; count<101; count+=5) {
        System.out.println(count);
	          }

        //*Dowhile Loop

        System.out.println("Count in Millimeters");

        int i = 0;
        do  {
            System.out.println("value of i: " + i);
            i++;
            System.out.println(+i *25.4 + "mm");
        } while (i <16);

        //*While Loop

        System.out.println("Count in millimeters");

        int Counts = 0;
        while (Counts <= 15) {
            System.out.println(Counts);
            Counts++;
            System.out.println(Counts * 25.4 + "mm");





         }

} }
