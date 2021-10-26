package com.okedroid.belajarjava;
import java.util.Objects;
import java.util.Scanner;

public class Training4 {
    public static void main(String args[]) {
        String huruf, hasil = ""; //Mendeklarasikan variable huruf dan hasil bertipe string.
        Scanner scanner = new Scanner(System.in); //Mendeklarasikan variable scanner untuk menginput huruf.

        System.out.print("Masukkan sebuah string: "); //Melakukan input string ke variable huruf.
        huruf = scanner.nextLine();

        int jumlah = huruf.length(); //Mendeklarasikan variable jumlahHuruf bertipe integer untuk menghitung
        int jumlahHuruf = jumlah - 1; //jumlah string yang diinputkan user, dan variable jumlah bertipe integer.

        for (int i = 0; i < jumlah; i++) {  // Melakukan perulangan sebanyak variable jumlah untuk membalikkan huruf.
            hasil = hasil + huruf.charAt(jumlahHuruf);
            jumlahHuruf--;
        }

        if (Objects.equals(hasil,huruf)){ //Kondisi membandingkan huruf yang di inputkan dengan hasil kata yang dibalik
            System.out.println("COOL"); // Mencetak COOL jika inputan dengan hasil kata yang dibalik sama
        }else{
            System.out.println("BAD"); //Mencetak BAD jika inputan dengan hasil kata yang dibalik tidak sama
        }
    }
}
