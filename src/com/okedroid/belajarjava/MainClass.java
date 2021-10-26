package com.okedroid.belajarjava;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        //Input
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100); //Angka yang akan di tebak
        System.out.println("Tebaklah Angka Antara 1-100"); //Cetak pesan
        Scanner masukan = new Scanner(System.in);
        jumlah = 0; // Set variable jumlah sebesar 0

        //Proses
        do { //Tag awal looping
            jumlah++; // Variable jumlah akan bertambah 1 setiap kali proses
            System.out.print("Masukkan Tebakan Anda : "); //Cetak pesan
            tebak = masukan.nextInt(); // Variable tebak berisi inputan angka

            //Output
            if (jumlah == 5) {
                System.out.println("Anda Sudah 5 Kali Melakukan Percobaan, Jawaban yang benar adalah " + random);
                break; //Cetak pesan jika jumlah tebakan = 5 dan tidak tertebak + perintah break untuk memberhentikan loopingan
            }else if (tebak > random) {
                System.out.println("Tebakan Terlalu Besar"); //Cetak pesan jika tebakan lebih besar dari angka yang akan di tebak
            } else if (tebak < random) {
                System.out.println("Tebakan Terlalu Kecil"); //Cetak pesan jika tebakan lebih kecil dari angka yang akan di tebak
            } else {
                System.out.print("Tebakan Benar! Setelah " + jumlah + " Kali Menebak"); //Cetak pesan Jika tebakan benar
            }
        }while (tebak != random); // Tag akhir looping|Yang memiliki arti, loopingan akan berhenti jika inputan tebak=nilai random
    }
}