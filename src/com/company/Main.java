package com.company;

public class Main {
    public static int[] thisarray = new int[10];
    public static void main(String[] args) {
        System.out.println("Testing Mergesort...");
        makearr(thisarray);
        returnarr(thisarray);
        DWongLib.mergesort(thisarray);
        returnarr(thisarray);
    }

    public static void makearr(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void returnarr(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
        System.out.println(".");
    }
}
