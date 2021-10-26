package com.okedroid.belajarjava;

import java.util.Scanner;

public class Training1 {

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukan nilai x :");
        bilangan = a.nextInt();
        pangkat(bilangan);

    }
    public static void pangkat(int angka)
    {
        int pangkat = (int)Math.pow(2, angka);
        System.out.println("2^" + angka + " = "+pangkat);
        String nilai = String.valueOf(pangkat);
        char[] array_jumlah = nilai.toCharArray();

        int jumlah_nilai = 0;

        for (int i = 0; i < array_jumlah.length;i++){
            int jumlah = array_jumlah[i] - '0';
            jumlah_nilai += jumlah;
        }

        System.out.println("Jumlahnya : " +jumlah_nilai);
    }

}
