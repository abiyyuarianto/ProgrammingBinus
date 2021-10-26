package com.okedroid.belajarjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TugasPersonal_2 {

    static ArrayList listBio = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void inputanAwal() throws IOException{
        String nama, alamat, status, NoKTP, tanggalLahir,NoHp;

        System.out.println();
        System.out.println("\t--------------------------------------------");
        System.out.println("\t\tProgram Biodata Dengan Java");
        System.out.println("\t--------------------------------------------");
        System.out.println("\t\tIsi biodata diri dengan lengkap!");
        System.out.println("\t--------------------------------------------");

        try{

            if(listBio.isEmpty()){
                System.out.print("\tNama Anda\t: ");
                nama=input.readLine();

                System.out.print("\tTanggal Lahir Anda\t: ");
                tanggalLahir=input.readLine();

                System.out.print("\tNomor Handphone Anda\t: ");
                NoHp=input.readLine();

                alamat = "-";
                status = "-";
                NoKTP = "-";

                listBio.add(nama);
                listBio.add(tanggalLahir);
                listBio.add(NoHp);
                listBio.add(alamat);
                listBio.add(status);
                listBio.add(NoKTP);

            }else{
                System.out.print("\tNama Anda\t: ");
                nama=input.readLine();

                System.out.print("\tTanggal Lahir Anda\t: ");
                tanggalLahir=input.readLine();

                System.out.print("\tNomor Handphone Anda\t: ");
                NoHp=input.readLine();

                alamat = "-";
                status = "-";
                NoKTP = "-";

                listBio.set(0, nama);
                listBio.set(1, tanggalLahir);
                listBio.set(2, NoHp);
                listBio.set(3, alamat);
                listBio.set(4, status);
                listBio.set(5, NoKTP);
            }

        }catch (IOException e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
    }

    static void listDataAwal(){
        try{
            if(listBio.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                // tampilkan semua data awal
                for(int i = 0; i < 3; i++){ // pemberian 3 untuk menampilkan data awal
                    System.out.println(String.format("\t[%d] %s",i, listBio.get(i)));
                }
                System.out.println("\t--------------------------------------------");
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
    }

    static void showMenu() throws IOException{

        System.out.println("\t================ Menu ================");
        System.out.println("\t[1] Lihat Data Diri");
        System.out.println("\t[2] Update Data Diri");
        System.out.println("\t[3] Keluar");
        System.out.print("\tPILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu){
            case 1:
                showAllData();
                break;
            case 2:
                editData();
                break;
            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("\tPilihan salah!");
        }
    }

    static void showAllData(){
        try{
            if(listBio.isEmpty()){
                System.out.println("Belum ada data");

            } else {

                // Tampilkan semua data biodata
                System.out.println("\t============== Biodata ==============");
                System.out.println(String.format("\t[1] Nama : %s\t", listBio.get(0)));
                System.out.println(String.format("\t[2] Alamat : %s\t", listBio.get(3)));
                System.out.println(String.format("\t[3] Nomor Handphone : %s\t", listBio.get(2)));
                System.out.println(String.format("\t[4] Tanggal lahir : %s\t", listBio.get(1)));
                System.out.println(String.format("\t[5] Status : %s\t", listBio.get(4)));
                System.out.println(String.format("\t[6] Nomor KTP : %s\t", listBio.get(5)));
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
    }

    static void editData() throws IOException{
        showAllData();
        System.out.println("\t[7] Cancel\t");
        System.out.println("\t===================================");
        int indexData;

        try{
            System.out.print("Pilih nomor: ");
            indexData = Integer.valueOf(input.readLine());

            if (indexData == 1){
                System.out.print("Update Nama Baru: ");
                String namaBaru = input.readLine();

                listBio.set(0, namaBaru);

            }else if(indexData == 2){
                System.out.print("Update Alamat: ");
                String alamatBaru = input.readLine();

                listBio.set(3, alamatBaru);

            }else if(indexData == 3){
                System.out.print("Update Nomor Handphone Baru: ");
                String nomorBaru = input.readLine();

                listBio.set(2, nomorBaru);

            }else if(indexData == 4){
                System.out.print("Update Tanggal Lahir Baru: ");
                String tanggalBaru = input.readLine();

                listBio.set(1, tanggalBaru);

            }else if(indexData == 5){
                System.out.print("Update Status: ");
                String statusBaru = input.readLine();

                listBio.set(4, statusBaru);

            }else if(indexData == 6){
                System.out.print("Update Nomor KTP: ");
                String ktpBaru = input.readLine();

                listBio.set(5, ktpBaru);

            }else if(indexData == 7){
                return;

            }else {
                System.out.println("\t Menu / Nomor Tidak Tersedia");
            }

        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException {
        char check;
        Scanner scan=new Scanner(System.in);

        try{
            do {
                inputanAwal();
                listDataAwal();

                System.out.print("Apakah Anda yakin dengan data tersebut? [Y|N] --> ");
                check = scan.next().charAt(0);
                if(check == 'n' || check == 'N'){

                }

            } while (check == 'n' || check == 'N');

            if (check == 'y' || check == 'Y') {

                do {
                    showMenu();

                } while (isRunning);
            }

        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
        finally {
            System.out.println("Baris di dalam finally akan dieksekusi");
        }

    }

}