package com.okedroid.belajarjava;

import java.util.Scanner;

public class LuasTanah {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int cetak, selisih;

        System.out.print("Masukan Luas Tanah = ");
        cetak = Input.nextInt();

        if (cetak <= 50){
            System.out.println("Harga Jasa yang Dikenakan adalah = Rp " + cetak * 1000000);
        }else{
            selisih = cetak - 50;
            System.out.println("Harga Jasa yang Dikenakan adalah = Rp " + ((selisih * 1500000) + 50000000));
        }

    }
}

