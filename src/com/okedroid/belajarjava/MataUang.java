package com.okedroid.belajarjava;
import java.util.Scanner;

public class MataUang {
    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);
        float rupiah, dolar, euro;
        System.out.print("Masukan Rupiah = ");
        rupiah = masukan.nextFloat();
        dolar = (float) (rupiah*0.0001);
        euro = (float) (rupiah*0.00004);
        System.out.println();
        System.out.println("Hasil Kurs : ");
        System.out.println("Dolar = " + dolar);
        System.out.println("Euro = " + euro);
    }
}

