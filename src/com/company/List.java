package com.company;

import java.util.Scanner;

public class List {

    public static boolean equals(int[] a, int[] b){
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("1 list length = ");
        int n = Math.abs(CorrectIntegerNumber(sc));
        int[] array=new int[n];
        WriteList(array);
        System.out.print("2 list length = ");
        n = Math.abs(CorrectIntegerNumber(sc));
        int[] array_second=new int[n];
        WriteList(array_second);

       System.out.print(equals(array,array_second));
    }
    public static void WriteList(int[] array){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            System.out.print("array ["+i+"] = ");
            array[i]=CorrectIntegerNumber(sc);
            System.out.println();
        }

    }
    public  static int CorrectIntegerNumber(Scanner sc){
        boolean  k=sc.hasNextInt();
        while (!k) {
            System.out.print("The input is not an integer ");
            System.out.print("enter number  ");

            sc.next();
            k=sc.hasNextInt();
        }

        return sc.nextInt();
    }

}
