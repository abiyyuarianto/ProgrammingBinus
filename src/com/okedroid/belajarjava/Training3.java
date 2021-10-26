package com.okedroid.belajarjava;
import java.util.Scanner;

public class Training3 {
    public static void main(String[] args) {

        int nilai;

        System.out.print("Tebaklah Angka Antara 1-100 : "); //Input Pesan
        Scanner angka = new Scanner(System.in);
        nilai = angka.nextInt();

        //Proses
        if(nilai > 0 && nilai <= 100){// Kondisi Jika variable nilai antara 1 - 100

            if(nilai % 2 == 0){ //Nilai Genap

                if(nilai >= 2 && nilai <= 5){ //Jika variable nilai antara 2 - 5
                    System.out.println("Tidak Ajaib");//Cetak Pesan

                }else if(nilai >= 6 && nilai <= 20){ //Jika variable nilai antara 6 - 20
                    System.out.println("Ajaib");//Cetak Pesan

                }else if(nilai > 20){//Jika variable nilai lebih besar dari 20
                    System.out.println("Tidak Ajaib");
                }

            }else{ //Nilai Ganjil
                System.out.println("Ajaib");//Cetak Pesan
            }

        }else { //Jika variable nilai tidak antara 1 - 100
            System.out.println("Angka Harus 1 - 100"); //Cetak Pesan
        }

       }
}
