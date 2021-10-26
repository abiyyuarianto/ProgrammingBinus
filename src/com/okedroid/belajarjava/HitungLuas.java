package com.okedroid.belajarjava;
import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int menu, diameter, panjang, lebar, tinggi, jari_jari;
        double phi, volume, luas;
        phi = 3.14;

        System.out.println("Menu Luas Permukaan dan Volume");
        System.out.println("1.Hitung luas permukaan dan volume tabung");
        System.out.println("2.Hitung  luas permukaan dan volume balok");
        System.out.println("3.Hitung luas permukaan dan volume bola");
        System.out.print("Pilih Menu = ");
        menu = Input.nextInt();

        if(menu == 1){
            System.out.println("Hitung Tabung");

            System.out.print("Masukan Diameter Tabung : ");
            diameter = Input.nextInt();
            System.out.print("Masukan Tinggi Tabung : ");
            tinggi = Input.nextInt();

            jari_jari = diameter / 2;

            luas = 2 * phi * jari_jari * (jari_jari + tinggi);
            volume = phi * (jari_jari * jari_jari * tinggi);

            System.out.println("Luas Permukaan Tabung = " + luas);
            System.out.println("Volume Tabung = " + volume);

        }else if(menu == 2){

            System.out.println("Hitung Balok");

            System.out.print("Masukan Panjang Balok : ");
            panjang = Input.nextInt();
            System.out.print("Masukan Lebar Balok : ");
            lebar = Input.nextInt();
            System.out.print("Masukan Tinggi Balok : ");
            tinggi = Input.nextInt();

            luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
            volume = panjang * lebar * tinggi;

            System.out.println("Luas Permukaan Balok = " + luas);
            System.out.println("Volume Balok = " + volume);


        }else if(menu == 3){
            System.out.println("Hitung Bola");

            System.out.print("Masukan Diameter Bola : ");
            diameter = Input.nextInt();

            jari_jari = diameter / 2;
            luas = 4 * phi * jari_jari * jari_jari;
            //volume = 4/3 * phi * jari_jari * jari_jari * jari_jari ;
            volume = 1.3 * phi * jari_jari * jari_jari * jari_jari ;

            System.out.println("Luas Permukaan Bola = " + luas);
            System.out.println("Volume Bola = " + volume);
        }else{
            System.out.println("Menu Tidak Tersedia");
        }
    }
}
