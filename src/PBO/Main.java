package PBO;

//Eror Handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Meminta pengguna untuk memasukkan jumlah tenda
            System.out.print("Masukkan jumlah tenda: ");
            int jumlahTenda = scanner.nextInt();
            scanner.nextLine(); // Membuang newline
            
            //array
            // Array untuk menyimpan objek tenda
            AnakTenda[] daftarTenda = new AnakTenda[jumlahTenda];

            // Memasukkan data tenda ke dalam array
            for (int i = 0; i < jumlahTenda; i++) {
                System.out.println("\nMasukkan data untuk tenda ke-" + (i + 1));
                System.out.print("Masukkan nama tenda: ");
                String namaTenda = scanner.nextLine();
                System.out.print("Masukkan harga sewa per hari: ");
                double hargaSewa = scanner.nextDouble();
                System.out.print("Masukkan kapasitas tenda: ");
                int kapasitas = scanner.nextInt();
                scanner.nextLine(); // Membuang newline

                daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);
            }
            //IO sederhana
            // Output informasi tenda
            System.out.println("\nInformasi Tenda:");
            for (int i = 0; i < jumlahTenda; i++) {
                daftarTenda[i].cetakInfo();
            }

            // Input data penyewaan
            System.out.print("\nMasukkan lama sewa (hari): ");
            int lamaSewa = scanner.nextInt();
            System.out.print("Masukkan jumlah orang: ");
            int jumlahOrang = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            // Hitung biaya sewa untuk setiap tenda
            System.out.println("\nBiaya Sewa untuk Setiap Tenda:");
            for (int i = 0; i < jumlahTenda; i++) {
                double biayaSewa = daftarTenda[i].hitungBiayaSewa(lamaSewa, jumlahOrang);
                System.out.println("Tenda " + (i + 1) + ": " + biayaSewa);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input yang dimasukkan tidak sesuai dengan tipe data yang diharapkan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
