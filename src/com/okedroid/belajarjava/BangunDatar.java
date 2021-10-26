package com.okedroid.belajarjava;
import java.util.Scanner;

public class BangunDatar {

    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Masukan Pola = ");
        n = input.nextInt();
        input.close();

        int jumlah = 1;
        for (int i = 3; i <= n; i++){
            for (int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= jumlah; k++){
                System.out.print("*");
            }
            jumlah+= 2;
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int u = 1; u <= n; u++){
            for (int o = 1; o <= n; o++){
                System.out.print("* ");
            }
                System.out.println(" ");
        }
    }
}
