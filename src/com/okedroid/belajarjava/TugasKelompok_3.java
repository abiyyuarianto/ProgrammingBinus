package com.okedroid.belajarjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TugasKelompok_3 {

    static ArrayList<String> listProduk = new ArrayList();
    static ArrayList<String> jumProduk = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void tambahProduk() throws IOException{
        String barang, jumlah;

        System.out.print("\tMasukan Produk Anda\t: ");
        barang=input.readLine();

        System.out.print("\tMasukan Jumlah nya\t: ");
        jumlah=input.readLine();

        listProduk.add(barang);
        jumProduk.add(jumlah);

    }

    static void showMenu() throws IOException{

        System.out.println("\t================ Menu ================");
        System.out.println("\t[1] Tambah Produk");
        System.out.println("\t[2] Hapus Produk");
        System.out.println("\t[3] Ubah Produk");
        System.out.println("\t[4] Lihat Produk");
        System.out.println("\t[5] Keluar");
        System.out.print("\tPILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu){
            case 1:
                tambahProduk();
                break;
            case 4:
                showAllData();
                break;
            case 3:
                editData();
                break;
            case 2:
                removeData();
                break;
            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("\tPilihan salah!");
        }
    }

    static void showAllData(){
        try{
            if (listProduk.size() > 0) {
                System.out.println("Produk List:");
                int index = 0;
                for (String data : listProduk) {
                    System.out.println(String.format("[%d] %s", index +1, data));
                    System.out.println(String.format("    Dengan Jumlah : %s", jumProduk.get(index)));
                    System.out.println("--------------------------");
                    index++;
                }
            } else {
                System.out.println("Tidak ada data!");
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
    }

    static void removeData() throws IOException {
        showAllData();
        try {
            System.out.print("Pilih produk: ");
            String produk = input.readLine();

            if (listProduk.contains(produk) == true) {
                int GetIndex = listProduk.indexOf(produk);

                System.out.println("Apakah Anda yakin mau menghapus produk ini dari keranjang Anda?");
                System.out.print("Jawab (Ya/Tidak): ");
                String jawab = input.readLine();

                if (jawab.contains("Ya")) {
                    // DELETE
                    jumProduk.remove(GetIndex);
                    listProduk.remove(GetIndex);

                    System.out.println("Berhasil dihapus!");
                }

            } else {
                throw new IndexOutOfBoundsException("Produk yang dicari tidak ada");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void editData() throws IOException{
        showAllData();
        try {
            System.out.print("Pilih produk: ");
            String produk = input.readLine();

            if (listProduk.contains(produk) == true) {
                int GetIndex = listProduk.indexOf(produk);

                System.out.print("Masukan Jumlah Produk yang Baru: ");
                String jumProduks = input.readLine();

                System.out.println("Apakah Anda yakin dengan jumlah produk saat ini?");
                System.out.print("Jawab (Ya/Tidak): ");
                String jawab = input.readLine();

                if (jawab.contains("Ya")) {
                    // update data
                    jumProduk.set(GetIndex, jumProduks);

                    System.out.println("Berhasil diubah!");
                }

            } else {
                throw new IndexOutOfBoundsException("Produk yang dicari tidak ada");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {

        try{
                do {
                    showMenu();

                } while (isRunning);

        }catch (Exception e){
            System.out.println("Terjadi Kesalahan Input");
            System.exit(1);
        }
        finally {
            System.out.println("Baris di dalam finally akan dieksekusi");
        }

    }

}