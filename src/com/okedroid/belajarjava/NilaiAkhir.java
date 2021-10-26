package com.okedroid.belajarjava;

import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner Nilai = new Scanner(System.in);
        int  HasilTP1, HasilTP2, HasilTK1,HasilTK2, HasilKuis1, HasilKuis2, HasilUAS, NilaiAkhir ;

        System.out.print("Masukan Nilai Tugas Personal 1 = ");
        HasilTP1 = Nilai.nextInt();

        System.out.print("Masukan Nilai Tugas Personal 2 = ");
        HasilTP2 = Nilai.nextInt();

        System.out.print("Masukan Nilai Tugas Kelompok 1 = ");
        HasilTK1 = Nilai.nextInt();

        System.out.print("Masukan Nilai Tugas Kelompok 2 = ");
        HasilTK2 = Nilai.nextInt();

        System.out.print("Masukan Nilai Kuis 1 = ");
        HasilKuis1 = Nilai.nextInt();

        System.out.print("Masukan Nilai Kuis 2 = ");
        HasilKuis2 = Nilai.nextInt();

        System.out.print("Masukan Nilai UAS = ");
        HasilUAS = Nilai.nextInt();

        NilaiAkhir = ((HasilTP1 * 15) + (HasilTP2 * 15) + (HasilTK1 * 10) + (HasilTK2 * 10) + (HasilKuis1 * 10) + (HasilKuis2 * 10) + (HasilUAS * 30)) /100;

        System.out.println();
        System.out.println("Hasil Perhitungan Nilai Akhir = " + NilaiAkhir);

        if (NilaiAkhir >= 85) {
            System.out.println("Grade = A");
        } else if (NilaiAkhir >= 75 && NilaiAkhir <= 84) {
            System.out.println("Grade = B");
        } else if (NilaiAkhir >= 65 && NilaiAkhir <= 74) {
            System.out.println("Grade = C ");
        } else if (NilaiAkhir >= 50 && NilaiAkhir <= 64) {
            System.out.println("Grade = D ");
        } else {
            System.out.println("Grade = F");
        }

    }
}
