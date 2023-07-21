# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama Tenda dan harga sewa, dan memberikan output berupa informasi detail dari Penyewaan Tenda tersebut seperti namma tenda, harga sewa, kapasitas, dan lama sewa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Tenda`, `AnakTenda`, dan `Main` adalah contoh dari class.

```bash
public class Tenda {
    ...
}

public class AnakTenda extends Tenda {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);` adalah contoh pembuatan object.

```bash
daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaTenda` dan `hargaSewa` adalah contoh atribut.

```bash
String namaTenda;
double hargaSewa;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Tenda` dan `AnakTenda`.

```bash
public Tenda(String namaTenda, double hargaSewa) {
this.namaTenda = namaTenda;
this.hargaSewa = hargaSewa;
}

public AnakTenda(String namaTenda, double hargaSewa, int kapasitas) {
super(namaTenda, hargaSewa);
this.kapasitas = kapasitas;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaTenda` dan `setHargaSewa` adalah contoh method mutator.

```bash
public void setNamaTenda(String namaTenda) {
this.namaTenda = namaTenda;
}

public void setHargaSewa(double hargaSewa) {
this.hargaSewa = hargaSewa;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaTenda` dan  `getHargaSewa`  adalah contoh method accessor.

```bash
public String getNamaTenda() {
return namaTenda;
}

public double getHargaSewa() {
return hargaSewa;
 }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaTenda` dan `hargaSewa` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaTenda;
private double hargaSewa;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Tenda` mewarisi `AnakTenda` dengan sintaks `extends`.

```bash
class AnakTenda extends Tenda {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `cetakInfo()` di `Tenda` merupakan overloading method `cetakInfo` dan `cetakInfo` di `AnakTenda` merupakan override dari method `cetakInfo` di `Tenda`.

```bash
@Override
public void cetakInfo() {
super.cetakInfo();
System.out.println("Kapasitas: " + kapasitas + " orang");
}


public double hitungBiayaSewa(int lamaSewa, int jumlahOrang) {
// Tambahan biaya jika kapasitas tidak mencukupi
//seleksi
if (jumlahOrang > kapasitas) {
int tambahanBiaya = (jumlahOrang - kapasitas) * 10000;
return super.hitungBiayaSewa(lamaSewa) + tambahanBiaya;
} else {
return super.hitungBiayaSewa(lamaSewa);
}
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam  `jumlahorang` dan seleksi `switch` dalam `kapasitas`.

```bash
public AnakTenda(String namaTenda, double hargaSewa, int kapasitas) {
        super(namaTenda, hargaSewa);
        this.kapasitas = kapasitas;
    }
    //polymophism
    // Override method cetakInfo() dari superclass
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas: " + kapasitas + " orang");
    }

    // Overload method hitungBiayaSewa() dari superclass
    public double hitungBiayaSewa(int lamaSewa, int jumlahOrang) {
        // Tambahan biaya jika kapasitas tidak mencukupi
        //seleksi
        if (jumlahOrang > kapasitas) {
            int tambahanBiaya = (jumlahOrang - kapasitas) * 10000;
            return super.hitungBiayaSewa(lamaSewa) + tambahanBiaya;
        } else {
            return super.hitungBiayaSewa(lamaSewa);
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahTenda; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
        try {
            // Meminta pengguna untuk memasukkan jumlah tenda
            System.out.print("Masukkan jumlah tenda: ");
            int jumlahTenda = scanner.nextInt();
            scanner.nextLine();
        for (int i = 0; i < jumlahTenda; i++) {
                System.out.println("\nMasukkan data untuk tenda ke-" + (i + 1));
                System.out.print("Masukkan nama tenda: ");
                String namaTenda = scanner.nextLine();
                System.out.print("Masukkan harga sewa per hari: ");
                double hargaSewa = scanner.nextDouble();
                System.out.print("Masukkan kapasitas tenda: ");
                int kapasitas = scanner.nextInt();
                scanner.nextLine();

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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);` adalah contoh penggunaan array.

```bash
daftarTenda[i] = new AnakTenda(namaTenda, hargaSewa, kapasitas);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{
} catch (InputMismatchException e) {
    System.out.println("Input yang dimasukkan tidak sesuai dengan tipe data yang diharapkan.");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
} finally {
}
```


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ryan Febryan
NPM: 2110010117
Kelas: 4A Nreg BJM
