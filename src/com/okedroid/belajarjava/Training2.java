package com.okedroid.belajarjava;
import java.util.Scanner;

public class Training2 {
    public static void main(String[] args){
        String value = "abc";
        changeValue(value);
        System.out.println(value);
    }
    public static String changeValue(String a){
        a = "xyz";
        System.out.println(a);
        return a;
    }
}
