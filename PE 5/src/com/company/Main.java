package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (true){
            if (i%20 == 0&&i%19 == 0&&i%18 == 0&&i%17 == 0&&i%16 == 0&&i%14 == 0&&i%13 == 0&&i%12 == 0&&i%11 == 0){
                System.out.println(i);
                System.exit(0);
            }
            i++;
        }
    }
}
