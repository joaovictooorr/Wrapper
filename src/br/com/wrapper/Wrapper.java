package br.com.wrapper;

import java.util.Scanner;

public class Wrapper {

    public static void wrapper(){
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        Long num2 = Long.valueOf(num);
        System.out.println(num);
    }

    public static void main(String[] args){

        wrapper();

    }
}
