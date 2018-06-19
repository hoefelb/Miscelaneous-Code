package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> multSet = new HashSet<>();
        for (int i =  100; i < 1000 ;i++){
            for (int j = 100; j < 1000; j++){
                multSet.add(i*j);
            }
        }
        for (int i = 1000*1000;i > 0; i--){
            if (multSet.contains(i)&& palindromeChecker(Integer.toString(i)))System.out.println(i);
        }
	// write your code here
    }

    public static boolean palindromeChecker(String s){
        int length = s.length();
    for (int i = 0; i < length; i++){
     if ((s.charAt(i)!=s.charAt(length-i-1))) return false;
    }
    return true;
    }
}
