package com.okedroid.belajarjava;
import java.util.Scanner;

public class MenghitungBilangan {
     public static void main(String[] args) {

       // PROGRAM PENJUMLAHAN LOG BASIS 10 & PENGURANGAN COS, SIN & TAN
         Scanner masukan = new Scanner(System.in);

         double bil1, bil2, bil3, cos1, sin2, tan3, kurang, logaritma;

         System.out.print("Masukan bil 1 : ");
         bil1 = masukan.nextInt();
         System.out.print("Masukan bil 2 : ");
         bil2 = masukan.nextInt();
         System.out.print("Masukan bil 3 : ");
         bil3 = masukan.nextInt();

         cos1 = Math.cos(bil1);
         sin2 = Math.sin(bil2);
         tan3 = Math.tan(bil3);
         kurang = cos1 - sin2 - tan3;
         logaritma = (bil1 * bil2 * bil3) / 10;

         System.out.println("Hasil penjumlahan logaritma basis 10 untuk log " + bil1 + " + log " + bil2 + " + log " + bil3 + " = " + logaritma);
         System.out.println("Hasil pengurangan : " + kurang);
     }
}
