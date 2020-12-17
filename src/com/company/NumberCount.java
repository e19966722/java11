package com.company;
import java.util.Scanner;

public class NumberCount {
        static int k=0;
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print number = ");
        int n = sc.nextInt();
        System.out.println(Number(n));
    }
    public static int Number(int number){
        if(number!=0) {
            k+=(number%10);
            number=number/10;
            return Number(number);
        }
        return k;
    }

}
