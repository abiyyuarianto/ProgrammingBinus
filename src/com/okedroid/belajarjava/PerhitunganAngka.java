package com.okedroid.belajarjava;

import java.util.Scanner;

public class PerhitunganAngka {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int Cetak1, Cetak2, Jumlah, Kurang, Kali, Bagi, Mod;

        System.out.print("Masukan Angka Pertama = ");
        Cetak1 = Input.nextInt();

        System.out.print("Masukan Angka Kedua = ");
        Cetak2 = Input.nextInt();

        Jumlah = Cetak1 + Cetak2;
        Kurang = Cetak1 - Cetak2;
        Kali = Cetak1 * Cetak2;
        Bagi = Cetak1 / Cetak2;
        Mod = Cetak1 % Cetak2;

        System.out.println("Hasil Perhitungan : ");
        System.out.println("Pertambahan = " + Jumlah);
        System.out.println("Pengurangan = " + Kurang);
        System.out.println("Perkalian = " + Kali);
        System.out.println("Pembagian = " + Bagi);
        System.out.println("Modulus = " + Mod);
    }
}
