package PBO;

import java.util.Scanner;

// Class Tenda sebagai superclass
class Tenda {
    //atribut dan encapsulation
    private String namaTenda;
    private double hargaSewa;

    // Constructor untuk inisialisasi
    public Tenda(String namaTenda, double hargaSewa) {
        this.namaTenda = namaTenda;
        this.hargaSewa = hargaSewa;
    }

    // Method Accessor
    public String getNamaTenda() {
        return namaTenda;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    // Method Mutator
    public void setNamaTenda(String namaTenda) {
        this.namaTenda = namaTenda;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Method untuk mencetak informasi tenda
    public void cetakInfo() {
        System.out.println("Nama Tenda: " + namaTenda);
        System.out.println("Harga Sewa: " + hargaSewa);
    }

    // Method untuk menghitung biaya sewa
    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }
}